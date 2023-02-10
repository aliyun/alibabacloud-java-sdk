// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateTopicConfigRequest extends TeaModel {
    @NameInMap("EnableBroadcast")
    public Boolean enableBroadcast;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TopicFullName")
    public String topicFullName;

    public static UpdateTopicConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicConfigRequest self = new UpdateTopicConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicConfigRequest setEnableBroadcast(Boolean enableBroadcast) {
        this.enableBroadcast = enableBroadcast;
        return this;
    }
    public Boolean getEnableBroadcast() {
        return this.enableBroadcast;
    }

    public UpdateTopicConfigRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
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
