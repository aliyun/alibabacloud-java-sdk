// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class CreateAndPayStorageOrderRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Copies")
    public Integer copies;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DeviceNoOwner")
    public Boolean deviceNoOwner;

    @NameInMap("EnableDefaultPlan")
    public Boolean enableDefaultPlan;

    @NameInMap("EventRecordDuration")
    public Integer eventRecordDuration;

    @NameInMap("EventRecordProlong")
    public Boolean eventRecordProlong;

    @NameInMap("ImmediateUse")
    public Boolean immediateUse;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("MaxRecordFileDuration")
    public Integer maxRecordFileDuration;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Specification")
    public String specification;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserName")
    public String userName;

    public static CreateAndPayStorageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndPayStorageOrderRequest self = new CreateAndPayStorageOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndPayStorageOrderRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateAndPayStorageOrderRequest setCopies(Integer copies) {
        this.copies = copies;
        return this;
    }
    public Integer getCopies() {
        return this.copies;
    }

    public CreateAndPayStorageOrderRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateAndPayStorageOrderRequest setDeviceNoOwner(Boolean deviceNoOwner) {
        this.deviceNoOwner = deviceNoOwner;
        return this;
    }
    public Boolean getDeviceNoOwner() {
        return this.deviceNoOwner;
    }

    public CreateAndPayStorageOrderRequest setEnableDefaultPlan(Boolean enableDefaultPlan) {
        this.enableDefaultPlan = enableDefaultPlan;
        return this;
    }
    public Boolean getEnableDefaultPlan() {
        return this.enableDefaultPlan;
    }

    public CreateAndPayStorageOrderRequest setEventRecordDuration(Integer eventRecordDuration) {
        this.eventRecordDuration = eventRecordDuration;
        return this;
    }
    public Integer getEventRecordDuration() {
        return this.eventRecordDuration;
    }

    public CreateAndPayStorageOrderRequest setEventRecordProlong(Boolean eventRecordProlong) {
        this.eventRecordProlong = eventRecordProlong;
        return this;
    }
    public Boolean getEventRecordProlong() {
        return this.eventRecordProlong;
    }

    public CreateAndPayStorageOrderRequest setImmediateUse(Boolean immediateUse) {
        this.immediateUse = immediateUse;
        return this;
    }
    public Boolean getImmediateUse() {
        return this.immediateUse;
    }

    public CreateAndPayStorageOrderRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateAndPayStorageOrderRequest setMaxRecordFileDuration(Integer maxRecordFileDuration) {
        this.maxRecordFileDuration = maxRecordFileDuration;
        return this;
    }
    public Integer getMaxRecordFileDuration() {
        return this.maxRecordFileDuration;
    }

    public CreateAndPayStorageOrderRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public CreateAndPayStorageOrderRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateAndPayStorageOrderRequest setSpecification(String specification) {
        this.specification = specification;
        return this;
    }
    public String getSpecification() {
        return this.specification;
    }

    public CreateAndPayStorageOrderRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateAndPayStorageOrderRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
