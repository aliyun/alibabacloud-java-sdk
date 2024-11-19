// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserCdnStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whetherAlibaba Cloud CDN is activated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Indicates whether your account has overdue payments.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InDebt")
    public Boolean inDebt;

    /**
     * <p>Indicates whether the grace period for your overdue payments expired.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    /**
     * <p>Indicates whether the service is available.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OnService")
    public Boolean onService;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39B1DC7F-9D25-5D54-8F02-6EE26A7F48CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserCdnStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserCdnStatusResponseBody self = new DescribeUserCdnStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserCdnStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeUserCdnStatusResponseBody setInDebt(Boolean inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public Boolean getInDebt() {
        return this.inDebt;
    }

    public DescribeUserCdnStatusResponseBody setInDebtOverdue(Boolean inDebtOverdue) {
        this.inDebtOverdue = inDebtOverdue;
        return this;
    }
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    public DescribeUserCdnStatusResponseBody setOnService(Boolean onService) {
        this.onService = onService;
        return this;
    }
    public Boolean getOnService() {
        return this.onService;
    }

    public DescribeUserCdnStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
