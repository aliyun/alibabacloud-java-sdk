// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTopicRequest extends TeaModel {
    @NameInMap("Codec")
    public String codec;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("EnableProxySubscribe")
    public Boolean enableProxySubscribe;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>This parameter is required.</p>
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
