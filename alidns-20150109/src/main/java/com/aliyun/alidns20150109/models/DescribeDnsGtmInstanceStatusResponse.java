// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AddrNotAvailableNum")
    @Validation(required = true)
    public Integer addrNotAvailableNum;

    @NameInMap("AddrPoolGroupNotAvailableNum")
    @Validation(required = true)
    public Integer addrPoolGroupNotAvailableNum;

    @NameInMap("SwitchToFailoverStrategyNum")
    @Validation(required = true)
    public Integer switchToFailoverStrategyNum;

    @NameInMap("StrategyNotAvailableNum")
    @Validation(required = true)
    public Integer strategyNotAvailableNum;

    @NameInMap("AddrAvailableNum")
    @Validation(required = true)
    public Integer addrAvailableNum;

    public static DescribeDnsGtmInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmInstanceStatusResponse self = new DescribeDnsGtmInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmInstanceStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmInstanceStatusResponse setAddrNotAvailableNum(Integer addrNotAvailableNum) {
        this.addrNotAvailableNum = addrNotAvailableNum;
        return this;
    }
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponse setAddrPoolGroupNotAvailableNum(Integer addrPoolGroupNotAvailableNum) {
        this.addrPoolGroupNotAvailableNum = addrPoolGroupNotAvailableNum;
        return this;
    }
    public Integer getAddrPoolGroupNotAvailableNum() {
        return this.addrPoolGroupNotAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponse setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
        this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
        return this;
    }
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

    public DescribeDnsGtmInstanceStatusResponse setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
        this.strategyNotAvailableNum = strategyNotAvailableNum;
        return this;
    }
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    public DescribeDnsGtmInstanceStatusResponse setAddrAvailableNum(Integer addrAvailableNum) {
        this.addrAvailableNum = addrAvailableNum;
        return this;
    }
    public Integer getAddrAvailableNum() {
        return this.addrAvailableNum;
    }

}
