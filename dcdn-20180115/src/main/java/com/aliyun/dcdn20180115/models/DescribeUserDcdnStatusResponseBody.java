// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the DCDN service is activated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Indicates whether your account has overdue payments.</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4F51E9C3-728F-4E35-952D-0ED87A06A8A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserDcdnStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserDcdnStatusResponseBody self = new DescribeUserDcdnStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserDcdnStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeUserDcdnStatusResponseBody setInDebt(Boolean inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public Boolean getInDebt() {
        return this.inDebt;
    }

    public DescribeUserDcdnStatusResponseBody setInDebtOverdue(Boolean inDebtOverdue) {
        this.inDebtOverdue = inDebtOverdue;
        return this;
    }
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    public DescribeUserDcdnStatusResponseBody setOnService(Boolean onService) {
        this.onService = onService;
        return this;
    }
    public Boolean getOnService() {
        return this.onService;
    }

    public DescribeUserDcdnStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
