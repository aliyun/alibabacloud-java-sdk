// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceStatusResponseBody extends TeaModel {
    @NameInMap("AddrAvailableNum")
    public Integer addrAvailableNum;

    @NameInMap("AddrNotAvailableNum")
    public Integer addrNotAvailableNum;

    @NameInMap("AddrPoolGroupNotAvailableNum")
    public Integer addrPoolGroupNotAvailableNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrategyNotAvailableNum")
    public Integer strategyNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    public Integer switchToFailoverStrategyNum;

    public static DescribeDnsGtmInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceStatusResponseBody self = new DescribeDnsGtmInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceStatusResponseBody setAddrAvailableNum(Integer addrAvailableNum) {
        this.addrAvailableNum = addrAvailableNum;
        return this;
    }
    public Integer getAddrAvailableNum() {
        return this.addrAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponseBody setAddrNotAvailableNum(Integer addrNotAvailableNum) {
        this.addrNotAvailableNum = addrNotAvailableNum;
        return this;
    }
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponseBody setAddrPoolGroupNotAvailableNum(Integer addrPoolGroupNotAvailableNum) {
        this.addrPoolGroupNotAvailableNum = addrPoolGroupNotAvailableNum;
        return this;
    }
    public Integer getAddrPoolGroupNotAvailableNum() {
        return this.addrPoolGroupNotAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceStatusResponseBody setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
        this.strategyNotAvailableNum = strategyNotAvailableNum;
        return this;
    }
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponseBody setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
        this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
        return this;
    }
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

}
