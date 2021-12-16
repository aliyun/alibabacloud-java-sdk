// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserDcdnStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("InDebt")
    public Boolean inDebt;

    @NameInMap("InDebtOverdue")
    public Boolean inDebtOverdue;

    @NameInMap("OnService")
    public Boolean onService;

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
