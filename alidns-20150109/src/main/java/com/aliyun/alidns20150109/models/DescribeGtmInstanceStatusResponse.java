// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrNotAvailableNum")
    @Validation(required = true)
    public Integer addrNotAvailableNum;

    @NameInMap("AddrPoolNotAvailableNum")
    @Validation(required = true)
    public Integer addrPoolNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    @Validation(required = true)
    public Integer switchToFailoverStrategyNum;

    @NameInMap("StrategyNotAvailableNum")
    @Validation(required = true)
    public Integer strategyNotAvailableNum;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("StatusReason")
    @Validation(required = true)
    public String statusReason;

    public static DescribeGtmInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusResponse self = new DescribeGtmInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceStatusResponse setAddrNotAvailableNum(Integer addrNotAvailableNum) {
        this.addrNotAvailableNum = addrNotAvailableNum;
        return this;
    }
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponse setAddrPoolNotAvailableNum(Integer addrPoolNotAvailableNum) {
        this.addrPoolNotAvailableNum = addrPoolNotAvailableNum;
        return this;
    }
    public Integer getAddrPoolNotAvailableNum() {
        return this.addrPoolNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponse setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
        this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
        return this;
    }
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

    public DescribeGtmInstanceStatusResponse setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
        this.strategyNotAvailableNum = strategyNotAvailableNum;
        return this;
    }
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceStatusResponse setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

}
