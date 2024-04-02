// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateCdiBagRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("FlowOutSpec")
    public Integer flowOutSpec;

    @NameInMap("OrderNum")
    public Integer orderNum;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateCdiBagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdiBagRequest self = new CreateCdiBagRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdiBagRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCdiBagRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateCdiBagRequest setFlowOutSpec(Integer flowOutSpec) {
        this.flowOutSpec = flowOutSpec;
        return this;
    }
    public Integer getFlowOutSpec() {
        return this.flowOutSpec;
    }

    public CreateCdiBagRequest setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Integer getOrderNum() {
        return this.orderNum;
    }

    public CreateCdiBagRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateCdiBagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
