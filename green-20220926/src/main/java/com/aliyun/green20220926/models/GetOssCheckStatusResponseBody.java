// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetOssCheckStatusResponseBody extends TeaModel {
    /**
     * <p>Bid。</p>
     * 
     * <strong>example:</strong>
     * <p>26842</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>Indicates whether the commodity is activated on Alibaba Cloud.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Buy")
    public Boolean buy;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>Indicates whether there is an overdue payment.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Indebt")
    public Boolean indebt;

    /**
     * <p>Indicates whether Security Center is authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("RamStatus")
    public String ramStatus;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. This ID can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the log analysis feature is authorized.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("SlsStatus")
    public String slsStatus;

    public static GetOssCheckStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOssCheckStatusResponseBody self = new GetOssCheckStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOssCheckStatusResponseBody setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public GetOssCheckStatusResponseBody setBuy(Boolean buy) {
        this.buy = buy;
        return this;
    }
    public Boolean getBuy() {
        return this.buy;
    }

    public GetOssCheckStatusResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public GetOssCheckStatusResponseBody setIndebt(Boolean indebt) {
        this.indebt = indebt;
        return this;
    }
    public Boolean getIndebt() {
        return this.indebt;
    }

    public GetOssCheckStatusResponseBody setRamStatus(String ramStatus) {
        this.ramStatus = ramStatus;
        return this;
    }
    public String getRamStatus() {
        return this.ramStatus;
    }

    public GetOssCheckStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOssCheckStatusResponseBody setSlsStatus(String slsStatus) {
        this.slsStatus = slsStatus;
        return this;
    }
    public String getSlsStatus() {
        return this.slsStatus;
    }

}
