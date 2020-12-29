// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("StrategyNotAvailableNum")
    public Integer strategyNotAvailableNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SwitchToFailoverStrategyNum")
    public Integer switchToFailoverStrategyNum;

    @NameInMap("StatusReason")
    public String statusReason;

    @NameInMap("AddrNotAvailableNum")
    public Integer addrNotAvailableNum;

    @NameInMap("AddrPoolNotAvailableNum")
    public Integer addrPoolNotAvailableNum;

    public static DescribeGtmInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusResponseBody self = new DescribeGtmInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceStatusResponseBody setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
        this.strategyNotAvailableNum = strategyNotAvailableNum;
        return this;
    }
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceStatusResponseBody setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
        this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
        return this;
    }
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

    public DescribeGtmInstanceStatusResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public DescribeGtmInstanceStatusResponseBody setAddrNotAvailableNum(Integer addrNotAvailableNum) {
        this.addrNotAvailableNum = addrNotAvailableNum;
        return this;
    }
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponseBody setAddrPoolNotAvailableNum(Integer addrPoolNotAvailableNum) {
        this.addrPoolNotAvailableNum = addrPoolNotAvailableNum;
        return this;
    }
    public Integer getAddrPoolNotAvailableNum() {
        return this.addrPoolNotAvailableNum;
    }

}
