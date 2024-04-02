// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateCdiBaseBagRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("FlowOutSpec")
    public Integer flowOutSpec;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateCdiBaseBagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCdiBaseBagRequest self = new CreateCdiBaseBagRequest();
        return TeaModel.build(map, self);
    }

    public CreateCdiBaseBagRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCdiBaseBagRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateCdiBaseBagRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateCdiBaseBagRequest setFlowOutSpec(Integer flowOutSpec) {
        this.flowOutSpec = flowOutSpec;
        return this;
    }
    public Integer getFlowOutSpec() {
        return this.flowOutSpec;
    }

    public CreateCdiBaseBagRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateCdiBaseBagRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
