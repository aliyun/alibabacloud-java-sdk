// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTopicRequest extends TeaModel {
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
    @NameInMap("TopicId")
    public String topicId;

    /**
     * <p>This parameter is required.</p>
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
