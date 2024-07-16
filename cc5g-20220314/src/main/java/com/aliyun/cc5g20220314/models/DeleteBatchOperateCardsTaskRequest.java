// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteBatchOperateCardsTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>boct-xxx</p>
     */
    @NameInMap("BatchOperateCardsTaskId")
    public String batchOperateCardsTaskId;

    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
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
