// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePipelinePublishBatchRequest extends TeaModel {
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
    public java.util.Map<String, ?> publishStrategy;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    public static CreatePipelinePublishBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinePublishBatchRequest self = new CreatePipelinePublishBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelinePublishBatchRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreatePipelinePublishBatchRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreatePipelinePublishBatchRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public CreatePipelinePublishBatchRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public CreatePipelinePublishBatchRequest setPublishStrategy(java.util.Map<String, ?> publishStrategy) {
        this.publishStrategy = publishStrategy;
        return this;
    }
    public java.util.Map<String, ?> getPublishStrategy() {
        return this.publishStrategy;
    }

    public CreatePipelinePublishBatchRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

}
