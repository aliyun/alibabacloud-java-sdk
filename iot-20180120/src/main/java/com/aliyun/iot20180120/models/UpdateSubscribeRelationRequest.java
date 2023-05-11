// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSubscribeRelationRequest extends TeaModel {
    @NameInMap("ConsumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>Specifies whether to push upstream device messages. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("DeviceDataFlag")
    public Boolean deviceDataFlag;

    /**
     * <p>Specifies whether to push messages about device lifecycle changes. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("DeviceLifeCycleFlag")
    public Boolean deviceLifeCycleFlag;

    /**
     * <p>Specifies whether to push messages about device status changes. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("DeviceStatusChangeFlag")
    public Boolean deviceStatusChangeFlag;

    /**
     * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter takes effect only if the **Type** parameter is set to **AMQP**.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("DeviceTagFlag")
    public Boolean deviceTagFlag;

    /**
     * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only for gateway products.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("DeviceTopoLifeCycleFlag")
    public Boolean deviceTopoLifeCycleFlag;

    /**
     * <p>Specifies whether to push messages if a gateway detects new sub-devices. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only for gateway products.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("FoundDeviceListFlag")
    public Boolean foundDeviceListFlag;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The configurations of the MNS queue. This parameter is required if the **Type** parameter is set to **AMQP**.</p>
     * <br>
     * <p>For more information, see the "Definition of the MnsConfiguration parameter" section.</p>
     */
    @NameInMap("MnsConfiguration")
    public String mnsConfiguration;

    /**
     * <p>Specifies whether to push notifications about the status of OTA update batches. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("OtaEventFlag")
    public Boolean otaEventFlag;

    /**
     * <p>Specifies whether to push notifications about the statuses of OTA update batches. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter takes effect only if the **Type** parameter is set to **AMQP**.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("OtaJobFlag")
    public Boolean otaJobFlag;

    /**
     * <p>Specifies whether to push messages about OTA module version numbers. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter takes effect only if the **Type** parameter is set to **AMQP**.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("OtaVersionFlag")
    public Boolean otaVersionFlag;

    /**
     * <p>The **ProductKey** of the product that is specified for the subscription.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SubscribeFlags")
    public String subscribeFlags;

    /**
     * <p>Specifies whether to push upstream historical Thing Specification Language (TSL) data. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no.</p>
     * <br>
     * <p>Default value: **false**.</p>
     */
    @NameInMap("ThingHistoryFlag")
    public Boolean thingHistoryFlag;

    /**
     * <p>The type of the subscription. Valid values:</p>
     * <br>
     * <p>*   **MNS**</p>
     * <p>*   **AMQP**</p>
     */
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

    public UpdateSubscribeRelationRequest setSubscribeFlags(String subscribeFlags) {
        this.subscribeFlags = subscribeFlags;
        return this;
    }
    public String getSubscribeFlags() {
        return this.subscribeFlags;
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
