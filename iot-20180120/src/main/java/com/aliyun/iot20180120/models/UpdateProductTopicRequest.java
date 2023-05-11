// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTopicRequest extends TeaModel {
    @NameInMap("Codec")
    public String codec;

    /**
     * <p>The description of the topic category. The description must be 1 to 100 characters in length.</p>
     */
    @NameInMap("Desc")
    public String desc;

    @NameInMap("EnableProxySubscribe")
    public Boolean enableProxySubscribe;

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
     * <p>The operation permissions of the device on the topic category. Valid values:</p>
     * <br>
     * <p>*   **SUB**: Subscribe.</p>
     * <p>*   **PUB**: Publish.</p>
     * <p>*   **ALL**: Publish and Subscribe.</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The ID of the topic category that you want to modify.</p>
     */
    @NameInMap("TopicId")
    public String topicId;

    /**
     * <p>The name of the user-defined category level that you want to set. By default, a topic category includes the following levels: \_productkey\_ and \_devicename\_. Separate the two levels with slashes (/). Format of a topic category: `productKey/deviceName/topicShortName`.</p>
     * <br>
     * <p>>  Each level can contain letters, digits, and underscores (\_), and cannot be empty.</p>
     */
    @NameInMap("TopicShortName")
    public String topicShortName;

    public static UpdateProductTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTopicRequest self = new UpdateProductTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductTopicRequest setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public UpdateProductTopicRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateProductTopicRequest setEnableProxySubscribe(Boolean enableProxySubscribe) {
        this.enableProxySubscribe = enableProxySubscribe;
        return this;
    }
    public Boolean getEnableProxySubscribe() {
        return this.enableProxySubscribe;
    }

    public UpdateProductTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductTopicRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateProductTopicRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

    public UpdateProductTopicRequest setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }
    public String getTopicShortName() {
        return this.topicShortName;
    }

}
