// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePublishBatchRequest extends TeaModel {
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
    public java.util.Map<String, ?> publishStrategy;

    public static CreatePublishBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishBatchRequest self = new CreatePublishBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishBatchRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreatePublishBatchRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public CreatePublishBatchRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

    public CreatePublishBatchRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public CreatePublishBatchRequest setPublishStrategy(java.util.Map<String, ?> publishStrategy) {
        this.publishStrategy = publishStrategy;
        return this;
    }
    public java.util.Map<String, ?> getPublishStrategy() {
        return this.publishStrategy;
    }

}
