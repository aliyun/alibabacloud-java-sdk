// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetPublishBatchDetailRequest extends TeaModel {
    @NameInMap("AppKey")
    @Validation(required = true)
    public String appKey;

    @NameInMap("BatchBid")
    @Validation(required = true)
    public String batchBid;

    @NameInMap("AppPlatform")
    @Validation(required = true)
    public Integer appPlatform;

    public static GetPublishBatchDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPublishBatchDetailRequest self = new GetPublishBatchDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetPublishBatchDetailRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetPublishBatchDetailRequest setBatchBid(String batchBid) {
        this.batchBid = batchBid;
        return this;
    }
    public String getBatchBid() {
        return this.batchBid;
    }

    public GetPublishBatchDetailRequest setAppPlatform(Integer appPlatform) {
        this.appPlatform = appPlatform;
        return this;
    }
    public Integer getAppPlatform() {
        return this.appPlatform;
    }

}
