// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateAppSessionBatchSyncShrinkRequest extends TeaModel {
    @NameInMap("AppInfos")
    public String appInfosShrink;

    @NameInMap("BatchId")
    public String batchId;

    public static CreateAppSessionBatchSyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSessionBatchSyncShrinkRequest self = new CreateAppSessionBatchSyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSessionBatchSyncShrinkRequest setAppInfosShrink(String appInfosShrink) {
        this.appInfosShrink = appInfosShrink;
        return this;
    }
    public String getAppInfosShrink() {
        return this.appInfosShrink;
    }

    public CreateAppSessionBatchSyncShrinkRequest setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

}
