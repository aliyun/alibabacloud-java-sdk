// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTopicRequest extends TeaModel {
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
     * <p>The ProductKey of the product for which you want to create a topic category.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The name of the user-defined category level that you want to set. By default, a topic category includes the following levels: \_productkey\_ and \_devicename\_. Separate the two levels with slashes (/). Format of a topic category: `productKey/deviceName/topicShortName` .</p>
     * <br>
     * <p>>  Each level can contain letters, digits, and underscores (\_), and cannot be empty.</p>
     */
    @NameInMap("TopicShortName")
    public String topicShortName;

    public static CreateProductTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTopicRequest self = new CreateProductTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductTopicRequest setCodec(String codec) {
        this.codec = codec;
        return this;
    }
    public String getCodec() {
        return this.codec;
    }

    public CreateProductTopicRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateProductTopicRequest setEnableProxySubscribe(Boolean enableProxySubscribe) {
        this.enableProxySubscribe = enableProxySubscribe;
        return this;
    }
    public Boolean getEnableProxySubscribe() {
        return this.enableProxySubscribe;
    }

    public CreateProductTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateProductTopicRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CreateProductTopicRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateProductTopicRequest setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }
    public String getTopicShortName() {
        return this.topicShortName;
    }

}
