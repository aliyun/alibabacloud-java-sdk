// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class RenewWebSiteInstanceRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderNum")
    public Integer orderNum;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    public static RenewWebSiteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewWebSiteInstanceRequest self = new RenewWebSiteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewWebSiteInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewWebSiteInstanceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public RenewWebSiteInstanceRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RenewWebSiteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewWebSiteInstanceRequest setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Integer getOrderNum() {
        return this.orderNum;
    }

    public RenewWebSiteInstanceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public RenewWebSiteInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewWebSiteInstanceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
