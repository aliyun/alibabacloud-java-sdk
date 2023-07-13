// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataSourceItemRequest extends TeaModel {
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The instance ID. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see the [Overview](~~356505~~) topic of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The topic that you want to add to the data source in the rules engine. Format: `/${productKey}/${deviceName}/topicShortName`. `${productKey}` specifies the **ProductKey** of the product to which a device belongs. `${deviceName}` specifies the name of the device. `topicShortName` specifies the custom name of the topic.</p>
     * <br>
     * <p>*   Basic communication topics or Thing Specification Language (TSL) communication topics are in the `/${productKey}/${deviceName}/topicShortName` format. You can replace `${deviceName}` with the plus sign (`+`) wildcard character. The wildcard character specifies that the topic applies to all devices in the product. Valid values of `topicShortName`:</p>
     * <br>
     * <p>    *   `/thing/event/property/post`: submits the property data of a device.</p>
     * <p>    *   `/thing/event/${tsl.event.identifier}/post`: submits the event data of a device. `${tsl.event.identifier}` specifies the identifier of an event in the TSL model.</p>
     * <p>    *   `/thing/lifecycle`: submits device lifecycle changes.</p>
     * <p>    *   `/thing/downlink/reply/message`: sends a response to a request from IoT Platform.</p>
     * <p>    *   `/thing/list/found`: submits data when a gateway detects a new sub-device.</p>
     * <p>    *   `/thing/topo/lifecycle`: submits device topology changes.</p>
     * <p>    *   `/thing/event/property/history/post`: submits the historical property data of a device.</p>
     * <p>    *   `/thing/event/${tsl.event.identifier}/post`: submits the historical event data of a device. `${tsl.event.identifier}` specifies the identifier of an event in the TSL model.</p>
     * <p>    *   `/ota/upgrade`: submits the over-the-air (OTA) update status.</p>
     * <p>    *   `/ota/version/post`: submits OTA module versions.</p>
     * <p>    *   `/thing/deviceinfo/update`: submits device tag changes.</p>
     * <br>
     * <p>    `/${productKey}/${packageId}/${jobId}/ota/job/status`: submits the status of each OTA update batch. This topic is a basic communication topic. `${packageId}` specifies the ID of the update package. `${jobId}` specifies the ID of the update batch.</p>
     * <br>
     * <p>*   Custom topics are in the `/${productKey}/${deviceName}/user/#` format. Example: `/${productKey}/${deviceName}/user/get`.</p>
     * <br>
     * <p>    You can call the [QueryProductTopic](~~69647~~) operation to view all custom topics of a product.</p>
     * <br>
     * <p>    When you specify a custom topic, you can use the plus sign (`+`) and number sign (`#`) wildcard characters.</p>
     * <br>
     * <p>    *   You can replace `${deviceName}` with the plus sign (`+`) wildcard character. The wildcard character specifies that the topic applies to all devices in the product.</p>
     * <p>    *   You can replace the fields that follow ${deviceName} with `/user/#`. The number sign (`#`) wildcard character specifies that the topic applies to all fields that follow `/user`.</p>
     * <br>
     * <p>*   Topics that are used to submit device status changes are in the `/as/mqtt/status/${productKey}/${deviceName}` format.</p>
     * <br>
     * <p>You can use the plus sign (`+`) wildcard character to specify that the status changes of all devices in the product are submitted.</p>
     * <br>
     * <p>For more information about how to use wildcard characters, see the "Custom topics with wildcard characters" section in [Use custom topics](~~85539~~).</p>
     * <br>
     * <p>For more information about the data formats of topics, see [Data formats](~~73736~~).</p>
     * <br>
     * <p>> You can add only the following topics to the data source in the rules engine for MQTT gateways, devices of MQTT gateways, and products and devices that use the open source MQTT protocol: custom topics, topics that are used to submit device status changes, and topics that are used to submit device lifecycle changes. For more information about custom topics, see the "Messaging" topic. If you set this parameter to a custom topic, you must specify ScopeType and ProductKey. If you set ScopeType to DEVICE, you must specify DeviceName.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static CreateDataSourceItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSourceItemRequest self = new CreateDataSourceItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSourceItemRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public CreateDataSourceItemRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDataSourceItemRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDataSourceItemRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateDataSourceItemRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public CreateDataSourceItemRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
