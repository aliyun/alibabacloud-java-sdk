// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DmsGatewayOrder extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FreeOrder")
    public Boolean freeOrder;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("PayNum")
    public Integer payNum;

    @NameInMap("Region")
    public String region;

    @NameInMap("State")
    public String state;

    public static DmsGatewayOrder build(java.util.Map<String, ?> map) throws Exception {
        DmsGatewayOrder self = new DmsGatewayOrder();
        return TeaModel.build(map, self);
    }

    public DmsGatewayOrder setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DmsGatewayOrder setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DmsGatewayOrder setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DmsGatewayOrder setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DmsGatewayOrder setFreeOrder(Boolean freeOrder) {
        this.freeOrder = freeOrder;
        return this;
    }
    public Boolean getFreeOrder() {
        return this.freeOrder;
    }

    public DmsGatewayOrder setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DmsGatewayOrder setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DmsGatewayOrder setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DmsGatewayOrder setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DmsGatewayOrder setPayNum(Integer payNum) {
        this.payNum = payNum;
        return this;
    }
    public Integer getPayNum() {
        return this.payNum;
    }

    public DmsGatewayOrder setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DmsGatewayOrder setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
