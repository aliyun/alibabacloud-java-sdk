// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateBatchOperateCardsTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>boct-xxxx</p>
     */
    @NameInMap("BatchOperateCardsTaskId")
    public String batchOperateCardsTaskId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://examplebucket.oss-eu-central-1.aliyuncs.com/">https://examplebucket.oss-eu-central-1.aliyuncs.com/</a>***</p>
     */
    @NameInMap("OperateResultOssFilePath")
    public String operateResultOssFilePath;

    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
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
