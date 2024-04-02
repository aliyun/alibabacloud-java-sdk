// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateWebSiteInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("OrderNum")
    public Integer orderNum;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static CreateWebSiteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebSiteInstanceRequest self = new CreateWebSiteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebSiteInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWebSiteInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateWebSiteInstanceRequest setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Integer getOrderNum() {
        return this.orderNum;
    }

    public CreateWebSiteInstanceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateWebSiteInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateWebSiteInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
