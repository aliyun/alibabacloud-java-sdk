// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class BindStorageOrderRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EnableDefaultPlan")
    public Boolean enableDefaultPlan;

    @NameInMap("EventRecordDuration")
    public Integer eventRecordDuration;

    @NameInMap("EventRecordProlong")
    public Boolean eventRecordProlong;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("MaxRecordFileDuration")
    public Integer maxRecordFileDuration;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static BindStorageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        BindStorageOrderRequest self = new BindStorageOrderRequest();
        return TeaModel.build(map, self);
    }

    public BindStorageOrderRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public BindStorageOrderRequest setEnableDefaultPlan(Boolean enableDefaultPlan) {
        this.enableDefaultPlan = enableDefaultPlan;
        return this;
    }
    public Boolean getEnableDefaultPlan() {
        return this.enableDefaultPlan;
    }

    public BindStorageOrderRequest setEventRecordDuration(Integer eventRecordDuration) {
        this.eventRecordDuration = eventRecordDuration;
        return this;
    }
    public Integer getEventRecordDuration() {
        return this.eventRecordDuration;
    }

    public BindStorageOrderRequest setEventRecordProlong(Boolean eventRecordProlong) {
        this.eventRecordProlong = eventRecordProlong;
        return this;
    }
    public Boolean getEventRecordProlong() {
        return this.eventRecordProlong;
    }

    public BindStorageOrderRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public BindStorageOrderRequest setMaxRecordFileDuration(Integer maxRecordFileDuration) {
        this.maxRecordFileDuration = maxRecordFileDuration;
        return this;
    }
    public Integer getMaxRecordFileDuration() {
        return this.maxRecordFileDuration;
    }

    public BindStorageOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindStorageOrderRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public BindStorageOrderRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BindStorageOrderRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BindStorageOrderRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
