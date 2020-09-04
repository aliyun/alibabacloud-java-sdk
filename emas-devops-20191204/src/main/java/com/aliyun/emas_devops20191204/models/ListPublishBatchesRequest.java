// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPublishBatchesRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("PlanBid")
    @Validation(required = true)
    public String planBid;

    @NameInMap("BatchType")
    public String batchType;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    public static ListPublishBatchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPublishBatchesRequest self = new ListPublishBatchesRequest();
        return TeaModel.build(map, self);
    }

    public ListPublishBatchesRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ListPublishBatchesRequest setPlanBid(String planBid) {
        this.planBid = planBid;
        return this;
    }
    public String getPlanBid() {
        return this.planBid;
    }

    public ListPublishBatchesRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public ListPublishBatchesRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

}
