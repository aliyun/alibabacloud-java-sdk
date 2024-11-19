// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataSourceItemRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>device1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The instance ID. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-0pp1n8t***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>gy***z</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <strong>example:</strong>
     * <p>PRODUCT</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The topic that you want to add to the data source in the rules engine. Format: <code>/${productKey}/${deviceName}/topicShortName</code>. <code>${productKey}</code> specifies the <strong>ProductKey</strong> of the product to which a device belongs. <code>${deviceName}</code> specifies the name of the device. <code>topicShortName</code> specifies the custom name of the topic.</p>
     * <ul>
     * <li><p>Basic communication topics or Thing Specification Language (TSL) communication topics are in the <code>/${productKey}/${deviceName}/topicShortName</code> format. You can replace <code>${deviceName}</code> with the plus sign (<code>+</code>) wildcard character. The wildcard character specifies that the topic applies to all devices in the product. Valid values of <code>topicShortName</code>:</p>
     * <ul>
     * <li><code>/thing/event/property/post</code>: submits the property data of a device.</li>
     * <li><code>/thing/event/${tsl.event.identifier}/post</code>: submits the event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</li>
     * <li><code>/thing/lifecycle</code>: submits device lifecycle changes.</li>
     * <li><code>/thing/downlink/reply/message</code>: sends a response to a request from IoT Platform.</li>
     * <li><code>/thing/list/found</code>: submits data when a gateway detects a new sub-device.</li>
     * <li><code>/thing/topo/lifecycle</code>: submits device topology changes.</li>
     * <li><code>/thing/event/property/history/post</code>: submits the historical property data of a device.</li>
     * <li><code>/thing/event/${tsl.event.identifier}/post</code>: submits the historical event data of a device. <code>${tsl.event.identifier}</code> specifies the identifier of an event in the TSL model.</li>
     * <li><code>/ota/upgrade</code>: submits the over-the-air (OTA) update status.</li>
     * <li><code>/ota/version/post</code>: submits OTA module versions.</li>
     * <li><code>/thing/deviceinfo/update</code>: submits device tag changes.</li>
     * </ul>
     * <p><code>/${productKey}/${packageId}/${jobId}/ota/job/status</code>: submits the status of each OTA update batch. This topic is a basic communication topic. <code>${packageId}</code> specifies the ID of the update package. <code>${jobId}</code> specifies the ID of the update batch.</p>
     * </li>
     * <li><p>Custom topics are in the <code>/${productKey}/${deviceName}/user/#</code> format. Example: <code>/${productKey}/${deviceName}/user/get</code>.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69647.html">QueryProductTopic</a> operation to view all custom topics of a product.</p>
     * <p>When you specify a custom topic, you can use the plus sign (<code>+</code>) and number sign (<code>#</code>) wildcard characters.</p>
     * <ul>
     * <li>You can replace <code>${deviceName}</code> with the plus sign (<code>+</code>) wildcard character. The wildcard character specifies that the topic applies to all devices in the product.</li>
     * <li>You can replace the fields that follow ${deviceName} with <code>/user/#</code>. The number sign (<code>#</code>) wildcard character specifies that the topic applies to all fields that follow <code>/user</code>.</li>
     * </ul>
     * </li>
     * <li><p>Topics that are used to submit device status changes are in the <code>/as/mqtt/status/${productKey}/${deviceName}</code> format.</p>
     * </li>
     * </ul>
     * <p>You can use the plus sign (<code>+</code>) wildcard character to specify that the status changes of all devices in the product are submitted.</p>
     * <p>For more information about how to use wildcard characters, see the &quot;Custom topics with wildcard characters&quot; section in <a href="https://help.aliyun.com/document_detail/85539.html">Use custom topics</a>.</p>
     * <p>For more information about the data formats of topics, see <a href="https://help.aliyun.com/document_detail/73736.html">Data formats</a>.</p>
     * <blockquote>
     * <p>You can add only the following topics to the data source in the rules engine for MQTT gateways, devices of MQTT gateways, and products and devices that use the open source MQTT protocol: custom topics, topics that are used to submit device status changes, and topics that are used to submit device lifecycle changes. For more information about custom topics, see the &quot;Messaging&quot; topic. If you set this parameter to a custom topic, you must specify ScopeType and ProductKey. If you set ScopeType to DEVICE, you must specify DeviceName.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/as/mqtt/status/gy***z/+</p>
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
