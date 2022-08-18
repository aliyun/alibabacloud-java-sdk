// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusResponseBody extends TeaModel {
    @NameInMap("AddrNotAvailableNum")
    public Integer addrNotAvailableNum;

    @NameInMap("AddrPoolNotAvailableNum")
    public Integer addrPoolNotAvailableNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusReason")
    public String statusReason;

    @NameInMap("StrategyNotAvailableNum")
    public Integer strategyNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    public Integer switchToFailoverStrategyNum;

    public static DescribeGtmInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusResponseBody self = new DescribeGtmInstanceStatusResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeGtmInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceStatusResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public DescribeGtmInstanceStatusResponseBody setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
        this.strategyNotAvailableNum = strategyNotAvailableNum;
        return this;
    }
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponseBody setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
        this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
        return this;
    }
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

}
