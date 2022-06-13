// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateBatchOperateCardsTaskResponseBody extends TeaModel {
    @NameInMap("BatchOperateCardsTaskId")
    public String batchOperateCardsTaskId;

    @NameInMap("OperateResultOssFilePath")
    public String operateResultOssFilePath;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBatchOperateCardsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchOperateCardsTaskResponseBody self = new CreateBatchOperateCardsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBatchOperateCardsTaskResponseBody setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
        this.batchOperateCardsTaskId = batchOperateCardsTaskId;
        return this;
    }
    public String getBatchOperateCardsTaskId() {
        return this.batchOperateCardsTaskId;
    }

    public CreateBatchOperateCardsTaskResponseBody setOperateResultOssFilePath(String operateResultOssFilePath) {
        this.operateResultOssFilePath = operateResultOssFilePath;
        return this;
    }
    public String getOperateResultOssFilePath() {
        return this.operateResultOssFilePath;
    }

    public CreateBatchOperateCardsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
