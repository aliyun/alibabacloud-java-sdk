// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    @NameInMap("Codec")
    public String codec;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnableBroadcast")
    public Boolean enableBroadcast;

    @NameInMap("EnableProxySubscribe")
    public Boolean enableProxySubscribe;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("ProductKey")
    public String productKey;

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
