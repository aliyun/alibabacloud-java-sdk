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
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableBroadcast")
    public Boolean enableBroadcast;

    @NameInMap("EnableProxySubscribe")
    public Boolean enableProxySubscribe;

    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see the [Overview](~~356505~~) topic of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The **ProductKey** of the product to which the device belongs. The device receives the retained message.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The custom topic for which you want to enable the retained message broadcasting feature.</p>
     * <br>
     * <p>*   If you use an MQTT gateway device, set this parameter to the original custom topic of the device. For more information, see [Topics](~~433806~~).</p>
     * <p>*   If you use a non-MQTT gateway device, set this parameter to a custom topic in the following format: `/broadcast/${productKey}/${Custom field}`. `${productKey}` is the value of the **ProductKey** request parameter. You can specify `${Custom field}` based on your business requirements.</p>
     * <br>
     * <p>>  When you develop devices, use code to define a broadcast topic. You do not need to create a topic in the IoT Platform console. You must grant devices the Subscribe permission or the Publish and Subscribe permission on the topic.</p>
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
