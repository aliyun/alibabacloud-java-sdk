// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteBatchOperateCardsTaskRequest extends TeaModel {
    @NameInMap("BatchOperateCardsTaskId")
    public String batchOperateCardsTaskId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBatchOperateCardsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBatchOperateCardsTaskRequest self = new DeleteBatchOperateCardsTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBatchOperateCardsTaskRequest setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
        this.batchOperateCardsTaskId = batchOperateCardsTaskId;
        return this;
    }
    public String getBatchOperateCardsTaskId() {
        return this.batchOperateCardsTaskId;
    }

    public DeleteBatchOperateCardsTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteBatchOperateCardsTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteBatchOperateCardsTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
