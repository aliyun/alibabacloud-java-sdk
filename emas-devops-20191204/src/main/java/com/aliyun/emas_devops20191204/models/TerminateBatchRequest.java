// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class TerminateBatchRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("BatchBid")
    @Validation(required = true)
    public String batchBid;

    @NameInMap("AppPlatform")
    public Integer appPlatform;

    @NameInMap("BatchType")
    @Validation(required = true)
    public String batchType;

    @NameInMap("SprintBid")
    public String sprintBid;

    public static TerminateBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        TerminateBatchRequest self = new TerminateBatchRequest();
        return TeaModel.build(map, self);
    }

    public TerminateBatchRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public TerminateBatchRequest setBatchBid(String batchBid) {
        this.batchBid = batchBid;
        return this;
    }
    public String getBatchBid() {
        return this.batchBid;
    }

    public TerminateBatchRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

    public TerminateBatchRequest setBatchType(String batchType) {
        this.batchType = batchType;
        return this;
    }
    public String getBatchType() {
        return this.batchType;
    }

    public TerminateBatchRequest setSprintBid(String sprintBid) {
        this.sprintBid = sprintBid;
        return this;
    }
    public String getSprintBid() {
        return this.sprintBid;
    }

}
