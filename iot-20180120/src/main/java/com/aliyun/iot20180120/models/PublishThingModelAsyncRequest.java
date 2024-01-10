// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PublishThingModelAsyncRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("ThingModelVersion")
    public String thingModelVersion;

    public static PublishThingModelAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishThingModelAsyncRequest self = new PublishThingModelAsyncRequest();
        return TeaModel.build(map, self);
    }

    public PublishThingModelAsyncRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishThingModelAsyncRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public PublishThingModelAsyncRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public PublishThingModelAsyncRequest setThingModelVersion(String thingModelVersion) {
        this.thingModelVersion = thingModelVersion;
        return this;
    }
    public String getThingModelVersion() {
        return this.thingModelVersion;
    }

}
