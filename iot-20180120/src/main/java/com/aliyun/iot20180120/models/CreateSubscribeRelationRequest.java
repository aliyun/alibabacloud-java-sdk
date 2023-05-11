// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSubscribeRelationRequest extends TeaModel {
    @NameInMap("ConsumerGroupIds")
    public java.util.List<String> consumerGroupIds;

    /**
     * <p>Specifies whether to push upstream device messages. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("DeviceDataFlag")
    public Boolean deviceDataFlag;

    /**
     * <p>Specifies whether to push messages about device lifecycle changes. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("DeviceLifeCycleFlag")
    public Boolean deviceLifeCycleFlag;

    /**
     * <p>Specifies whether to push messages about device status changes. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("DeviceStatusChangeFlag")
    public Boolean deviceStatusChangeFlag;

    /**
     * <p>Specifies whether to push messages about device tag changes. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only if you set the **Type** parameter to **AMQP**.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("DeviceTagFlag")
    public Boolean deviceTagFlag;

    /**
     * <p>Specifies whether to push messages about topological relationship changes of devices. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only for gateway products.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("DeviceTopoLifeCycleFlag")
    public Boolean deviceTopoLifeCycleFlag;

    /**
     * <p>Specifies whether to push messages when a gateway detects new sub-devices. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only for gateway products.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("FoundDeviceListFlag")
    public Boolean foundDeviceListFlag;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The configurations of the MNS queue. If you set the **Type** parameter to **AMQP**, this parameter is required.</p>
     * <br>
     * <p>For more information, see the "Definition of the MnsConfiguration parameter" section.</p>
     */
    @NameInMap("MnsConfiguration")
    public String mnsConfiguration;

    /**
     * <p>Specifies whether to push notifications about the status of over-the-air (OTA) update batches. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("OtaEventFlag")
    public Boolean otaEventFlag;

    /**
     * <p>Specifies whether to push notifications about the status of OTA update batches. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only if you set the **Type** parameter to **AMQP**.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("OtaJobFlag")
    public Boolean otaJobFlag;

    /**
     * <p>Specifies whether to push messages about the version numbers of OTA modules. Valid values:</p>
     * <br>
     * <p>*   **true**: yes. This parameter is valid only if you set the **Type** parameter to **AMQP**.</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("OtaVersionFlag")
    public Boolean otaVersionFlag;

    /**
     * <p>The **ProductKey** of the product that is specified for the subscription.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>Specifies whether to receive the messages of a specific subscribed product.</p>
     * <br>
     * <p>If you subscribe to JT/T 808 gateway products, you must configure the **SubscribeFlags** parameter. Set the value to the following code.</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p>{</p>
     * <p>    "jt808DeviceDataFlag": true</p>
     * <p>}</p>
     * <p>```</p>
     */
    @NameInMap("SubscribeFlags")
    public String subscribeFlags;

    /**
     * <p>Specifies whether to push upstream historical Thing Specification Language (TSL) data. Valid values:</p>
     * <br>
     * <p>*   **true**: yes.</p>
     * <p>*   **false**: no. This is the default value.</p>
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

    public static CreateSubscribeRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscribeRelationRequest self = new CreateSubscribeRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubscribeRelationRequest setConsumerGroupIds(java.util.List<String> consumerGroupIds) {
        this.consumerGroupIds = consumerGroupIds;
        return this;
    }
    public java.util.List<String> getConsumerGroupIds() {
        return this.consumerGroupIds;
    }

    public CreateSubscribeRelationRequest setDeviceDataFlag(Boolean deviceDataFlag) {
        this.deviceDataFlag = deviceDataFlag;
        return this;
    }
    public Boolean getDeviceDataFlag() {
        return this.deviceDataFlag;
    }

    public CreateSubscribeRelationRequest setDeviceLifeCycleFlag(Boolean deviceLifeCycleFlag) {
        this.deviceLifeCycleFlag = deviceLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceLifeCycleFlag() {
        return this.deviceLifeCycleFlag;
    }

    public CreateSubscribeRelationRequest setDeviceStatusChangeFlag(Boolean deviceStatusChangeFlag) {
        this.deviceStatusChangeFlag = deviceStatusChangeFlag;
        return this;
    }
    public Boolean getDeviceStatusChangeFlag() {
        return this.deviceStatusChangeFlag;
    }

    public CreateSubscribeRelationRequest setDeviceTagFlag(Boolean deviceTagFlag) {
        this.deviceTagFlag = deviceTagFlag;
        return this;
    }
    public Boolean getDeviceTagFlag() {
        return this.deviceTagFlag;
    }

    public CreateSubscribeRelationRequest setDeviceTopoLifeCycleFlag(Boolean deviceTopoLifeCycleFlag) {
        this.deviceTopoLifeCycleFlag = deviceTopoLifeCycleFlag;
        return this;
    }
    public Boolean getDeviceTopoLifeCycleFlag() {
        return this.deviceTopoLifeCycleFlag;
    }

    public CreateSubscribeRelationRequest setFoundDeviceListFlag(Boolean foundDeviceListFlag) {
        this.foundDeviceListFlag = foundDeviceListFlag;
        return this;
    }
    public Boolean getFoundDeviceListFlag() {
        return this.foundDeviceListFlag;
    }

    public CreateSubscribeRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSubscribeRelationRequest setMnsConfiguration(String mnsConfiguration) {
        this.mnsConfiguration = mnsConfiguration;
        return this;
    }
    public String getMnsConfiguration() {
        return this.mnsConfiguration;
    }

    public CreateSubscribeRelationRequest setOtaEventFlag(Boolean otaEventFlag) {
        this.otaEventFlag = otaEventFlag;
        return this;
    }
    public Boolean getOtaEventFlag() {
        return this.otaEventFlag;
    }

    public CreateSubscribeRelationRequest setOtaJobFlag(Boolean otaJobFlag) {
        this.otaJobFlag = otaJobFlag;
        return this;
    }
    public Boolean getOtaJobFlag() {
        return this.otaJobFlag;
    }

    public CreateSubscribeRelationRequest setOtaVersionFlag(Boolean otaVersionFlag) {
        this.otaVersionFlag = otaVersionFlag;
        return this;
    }
    public Boolean getOtaVersionFlag() {
        return this.otaVersionFlag;
    }

    public CreateSubscribeRelationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateSubscribeRelationRequest setSubscribeFlags(String subscribeFlags) {
        this.subscribeFlags = subscribeFlags;
        return this;
    }
    public String getSubscribeFlags() {
        return this.subscribeFlags;
    }

    public CreateSubscribeRelationRequest setThingHistoryFlag(Boolean thingHistoryFlag) {
        this.thingHistoryFlag = thingHistoryFlag;
        return this;
    }
    public Boolean getThingHistoryFlag() {
        return this.thingHistoryFlag;
    }

    public CreateSubscribeRelationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
