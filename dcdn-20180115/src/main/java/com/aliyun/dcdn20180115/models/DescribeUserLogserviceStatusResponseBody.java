// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserLogserviceStatusResponseBody extends TeaModel {
    @NameInMap("InDebt")
    public Boolean inDebt;

    @NameInMap("OnService")
    public Boolean onService;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    @NameInMap("Enabled")
    public Boolean enabled;

    public static DescribeUserLogserviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogserviceStatusResponseBody self = new DescribeUserLogserviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogserviceStatusResponseBody setInDebt(Boolean inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public Boolean getInDebt() {
        return this.inDebt;
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

    public DescribeUserLogserviceStatusResponseBody setInDebtOverdue(Boolean inDebtOverdue) {
        this.inDebtOverdue = inDebtOverdue;
        return this;
    }
    public Boolean getInDebtOverdue() {
        return this.inDebtOverdue;
    }

    public DescribeUserLogserviceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
