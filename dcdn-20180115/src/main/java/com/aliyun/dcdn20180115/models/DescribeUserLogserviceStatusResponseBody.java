// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserLogserviceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Log Service is activated.</p>
     * <br>
     * <p>*   true: activated</p>
     * <p>*   false: not activated</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>Indicates whether your Log Service has overdue payments.</p>
     * <br>
     * <p>*   true: Your Log Service has overdue payments.</p>
     * <p>*   false: Your Log Service does not have overdue payments.</p>
     */
    @NameInMap("InDebt")
    public Boolean inDebt;

    /**
     * <p>Indicates whether the overdue payments of Log Service have passed the grace period.</p>
     * <br>
     * <p>*   true: The overdue payments of Log Service have passed the grace period.</p>
     * <p>*   false: The overdue payments of Log Service have not passed the grace period.</p>
     */
    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    /**
     * <p>Indicates whether Log Service is available.</p>
     * <br>
     * <p>*   true: available</p>
     * <p>*   false: unavailable</p>
     */
    @NameInMap("OnService")
    public Boolean onService;

    /**
     * <p>The ID of the request.</p>
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
