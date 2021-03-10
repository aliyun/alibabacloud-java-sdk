// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateProductTopicRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Operation")
    @Validation(required = true)
    public String operation;

    @NameInMap("TopicShortName")
    @Validation(required = true)
    public String topicShortName;

    @NameInMap("TopicId")
    @Validation(required = true)
    public String topicId;

    public static UpdateProductTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductTopicRequest self = new UpdateProductTopicRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateProductTopicRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateProductTopicRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateProductTopicRequest setTopicShortName(String topicShortName) {
        this.topicShortName = topicShortName;
        return this;
    }
    public String getTopicShortName() {
        return this.topicShortName;
    }

    public UpdateProductTopicRequest setTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }
    public String getTopicId() {
        return this.topicId;
    }

}
