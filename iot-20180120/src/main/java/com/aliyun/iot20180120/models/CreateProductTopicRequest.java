// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductTopicRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    @Validation(required = true)
    public String productKey;

    @NameInMap("TopicShortName")
    @Validation(required = true)
    public String topicShortName;

    @NameInMap("Operation")
    @Validation(required = true)
    public String operation;

    @NameInMap("Desc")
    public String desc;

    public static CreateProductTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductTopicRequest self = new CreateProductTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductTopicRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
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

    public CreateProductTopicRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CreateProductTopicRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
