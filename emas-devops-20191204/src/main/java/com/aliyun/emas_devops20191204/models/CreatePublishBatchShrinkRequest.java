// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePublishBatchShrinkRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    @NameInMap("BatchType")
    @Validation(required = true)
    public String batchType;

    @NameInMap("PublishStrategy")
    @Validation(required = true)
    public String publishStrategyShrink;

    public static CreatePublishBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishBatchShrinkRequest self = new CreatePublishBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishBatchShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreatePublishBatchShrinkRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreatePublishBatchShrinkRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

    public CreatePublishBatchShrinkRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public CreatePublishBatchShrinkRequest setPublishStrategyShrink(String publishStrategyShrink) {
        this.publishStrategyShrink = publishStrategyShrink;
        return this;
    }
    public String getPublishStrategyShrink() {
        return this.publishStrategyShrink;
    }

}
