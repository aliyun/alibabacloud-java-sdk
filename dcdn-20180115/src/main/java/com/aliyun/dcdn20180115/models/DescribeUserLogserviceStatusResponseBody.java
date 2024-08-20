// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserLogserviceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Log Service is activated.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Indicates whether your Log Service has overdue payments.</p>
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
     * <p>Indicates whether an overdue payment of your Log Service has passed the grace period.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    /**
     * <p>Indicates whether Log Service is available.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
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

    public static DescribeUserLogserviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogserviceStatusResponseBody self = new DescribeUserLogserviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogserviceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public DescribeUserLogserviceStatusResponseBody setInDebt(Boolean inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public Boolean getInDebt() {
        return this.inDebt;
    }

    public DescribeUserLogserviceStatusResponseBody setInDebtOverdue(Boolean inDebtOverdue) {
        this.inDebtOverdue = inDebtOverdue;
        return this;
    }
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    public DescribeUserLogserviceStatusResponseBody setOnService(Boolean onService) {
        this.onService = onService;
        return this;
    }
    public Boolean getOnService() {
        return this.onService;
    }

    public DescribeUserLogserviceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
