// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePipelinePublishBatchShrinkRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    @NameInMap("PipelineInstanceId")
    public String pipelineInstanceId;

    @NameInMap("BatchType")
    @Validation(required = true)
    public String batchType;

    @NameInMap("PublishStrategy")
    @Validation(required = true)
    public String publishStrategyShrink;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    public static CreatePipelinePublishBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinePublishBatchShrinkRequest self = new CreatePipelinePublishBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelinePublishBatchShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreatePipelinePublishBatchShrinkRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreatePipelinePublishBatchShrinkRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public CreatePipelinePublishBatchShrinkRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public CreatePipelinePublishBatchShrinkRequest setPublishStrategyShrink(String publishStrategyShrink) {
        this.publishStrategyShrink = publishStrategyShrink;
        return this;
    }
    public String getPublishStrategyShrink() {
        return this.publishStrategyShrink;
    }

    public CreatePipelinePublishBatchShrinkRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

}
