// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ConsumeFreeStorageRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

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

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("Quota")
    public Integer quota;

    public static ConsumeFreeStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsumeFreeStorageRequest self = new ConsumeFreeStorageRequest();
        return TeaModel.build(map, self);
    }

    public ConsumeFreeStorageRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ConsumeFreeStorageRequest setEnableDefaultPlan(Boolean enableDefaultPlan) {
        this.enableDefaultPlan = enableDefaultPlan;
        return this;
    }
    public Boolean getEnableDefaultPlan() {
        return this.enableDefaultPlan;
    }

    public ConsumeFreeStorageRequest setEventRecordDuration(Integer eventRecordDuration) {
        this.eventRecordDuration = eventRecordDuration;
        return this;
    }
    public Integer getEventRecordDuration() {
        return this.eventRecordDuration;
    }

    public ConsumeFreeStorageRequest setEventRecordProlong(Boolean eventRecordProlong) {
        this.eventRecordProlong = eventRecordProlong;
        return this;
    }
    public Boolean getEventRecordProlong() {
        return this.eventRecordProlong;
    }

    public ConsumeFreeStorageRequest setImmediateUse(Boolean immediateUse) {
        this.immediateUse = immediateUse;
        return this;
    }
    public Boolean getImmediateUse() {
        return this.immediateUse;
    }

    public ConsumeFreeStorageRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public ConsumeFreeStorageRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public ConsumeFreeStorageRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ConsumeFreeStorageRequest setQuota(Integer quota) {
        this.quota = quota;
        return this;
    }
    public Integer getQuota() {
        return this.quota;
    }

}
