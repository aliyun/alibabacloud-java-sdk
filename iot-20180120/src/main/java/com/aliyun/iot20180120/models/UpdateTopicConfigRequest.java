// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    @NameInMap("Codec")
    public String codec;

    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the retained message broadcasting feature for a custom topic.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBroadcast")
    public Boolean enableBroadcast;

    @NameInMap("EnableProxySubscribe")
    public Boolean enableProxySubscribe;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs. The device receives the retained message.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a1Q5XoY****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The custom topic for which you want to enable the retained message broadcasting feature.</p>
     * <ul>
     * <li>If you use an MQTT gateway device, set this parameter to the original custom topic of the device. For more information, see <a href="https://help.aliyun.com/document_detail/433806.html">Topics</a>.</li>
     * <li>If you use a non-MQTT gateway device, set this parameter to a custom topic in the following format: <code>/broadcast/${productKey}/${Custom field}</code>. <code>${productKey}</code> is the value of the <strong>ProductKey</strong> request parameter. You can specify <code>${Custom field}</code> based on your business requirements.</li>
     * </ul>
     * <blockquote>
     * <p> When you develop devices, use code to define a broadcast topic. You do not need to create a topic in the IoT Platform console. You must grant devices the Subscribe permission or the Publish and Subscribe permission on the topic.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TopicFullName")
    public String topicFullName;

    public static UpdateTopicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicConfigRequest self = new UpdateTopicConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicConfigRequest setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public UpdateTopicConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTopicConfigRequest setEnableBroadcast(Boolean enableBroadcast) {
        this.enableBroadcast = enableBroadcast;
        return this;
    }
    public Boolean getEnableBroadcast() {
        return this.enableBroadcast;
    }

    public UpdateTopicConfigRequest setEnableProxySubscribe(Boolean enableProxySubscribe) {
        this.enableProxySubscribe = enableProxySubscribe;
        return this;
    }
    public Boolean getEnableProxySubscribe() {
        return this.enableProxySubscribe;
    }

    public UpdateTopicConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateTopicConfigRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateTopicConfigRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateTopicConfigRequest setTopicFullName(String topicFullName) {
        this.topicFullName = topicFullName;
        return this;
    }
    public String getTopicFullName() {
        return this.topicFullName;
    }

}
