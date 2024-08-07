// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The number of available addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddrAvailableNum")
    public Integer addrAvailableNum;

    /**
     * <p>The number of unavailable addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddrNotAvailableNum")
    public Integer addrNotAvailableNum;

    /**
     * <p>The number of unavailable address pool groups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AddrPoolGroupNotAvailableNum")
    public Integer addrPoolGroupNotAvailableNum;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of access policies that are unavailable in the current active address pool group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StrategyNotAvailableNum")
    public Integer strategyNotAvailableNum;

    /**
     * <p>The number of access policies switched to the secondary address pool group.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
