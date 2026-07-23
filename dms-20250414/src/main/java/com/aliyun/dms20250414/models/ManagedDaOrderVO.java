// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ManagedDaOrderVO extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("orderId")
    public Long orderId;

    @NameInMap("payNum")
    public Integer payNum;

    @NameInMap("region")
    public String region;

    @NameInMap("state")
    public String state;

    @NameInMap("subscriptionPlan")
    public String subscriptionPlan;

    public static ManagedDaOrderVO build(java.util.Map<String, ?> map) throws Exception {
        ManagedDaOrderVO self = new ManagedDaOrderVO();
        return TeaModel.build(map, self);
    }

    public ManagedDaOrderVO setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ManagedDaOrderVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ManagedDaOrderVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ManagedDaOrderVO setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ManagedDaOrderVO setPayNum(Integer payNum) {
        this.payNum = payNum;
        return this;
    }
    public Integer getPayNum() {
        return this.payNum;
    }

    public ManagedDaOrderVO setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ManagedDaOrderVO setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ManagedDaOrderVO setSubscriptionPlan(String subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
        return this;
    }
    public String getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

}
