// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class CreatePipelinePublishBatchResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public String result;

    public static CreatePipelinePublishBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinePublishBatchResponse self = new CreatePipelinePublishBatchResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelinePublishBatchResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePipelinePublishBatchResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
