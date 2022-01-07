// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSubscribeRelationRequest extends TeaModel {
    @NameInMap("ConsumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    @NameInMap("DeviceDataFlag")
    public Boolean deviceDataFlag;

    @NameInMap("DeviceLifeCycleFlag")
    public Boolean deviceLifeCycleFlag;

    @NameInMap("DeviceStatusChangeFlag")
    public Boolean deviceStatusChangeFlag;

    @NameInMap("DeviceTagFlag")
    public Boolean deviceTagFlag;

    @NameInMap("DeviceTopoLifeCycleFlag")
    public Boolean deviceTopoLifeCycleFlag;

    @NameInMap("FoundDeviceListFlag")
    public Boolean foundDeviceListFlag;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("MnsConfiguration")
    public String mnsConfiguration;

    @NameInMap("OtaEventFlag")
    public Boolean otaEventFlag;

    @NameInMap("OtaJobFlag")
    public Boolean otaJobFlag;

    @NameInMap("OtaVersionFlag")
    public Boolean otaVersionFlag;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ThingHistoryFlag")
    public Boolean thingHistoryFlag;

    @NameInMap("Type")
    public String type;

    public static UpdateSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubscribeRelationRequest self = new UpdateSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubscribeRelationRequest setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    public UpdateSubscribeRelationRequest setDeviceDataFlag(Boolean deviceDataFlag) {
        this.deviceDataFlag = deviceDataFlag;
        return this;
    }
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
        this.deviceLifeCycleFlag = deviceLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
        this.deviceStatusChangeFlag = deviceStatusChangeFlag;
        return this;
    }
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceTagFlag(Boolean deviceTagFlag) {
        this.deviceTagFlag = deviceTagFlag;
        return this;
    }
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    public UpdateSubscribeRelationRequest setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
        this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    public UpdateSubscribeRelationRequest setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
        this.foundDeviceListFlag = foundDeviceListFlag;
        return this;
    }
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    public UpdateSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSubscribeRelationRequest setMnsConfiguration(String mnsConfiguration) {
        this.mnsConfiguration = mnsConfiguration;
        return this;
    }
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    public UpdateSubscribeRelationRequest setOtaEventFlag(Boolean otaEventFlag) {
        this.otaEventFlag = otaEventFlag;
        return this;
    }
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    public UpdateSubscribeRelationRequest setOtaJobFlag(Boolean otaJobFlag) {
        this.otaJobFlag = otaJobFlag;
        return this;
    }
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    public UpdateSubscribeRelationRequest setOtaVersionFlag(Boolean otaVersionFlag) {
        this.otaVersionFlag = otaVersionFlag;
        return this;
    }
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    public UpdateSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateSubscribeRelationRequest setThingHistoryFlag(Boolean thingHistoryFlag) {
        this.thingHistoryFlag = thingHistoryFlag;
        return this;
    }
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    public UpdateSubscribeRelationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
