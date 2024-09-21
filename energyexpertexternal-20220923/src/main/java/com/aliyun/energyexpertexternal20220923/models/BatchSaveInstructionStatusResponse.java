// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchSaveInstructionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSaveInstructionStatusResponseBody body;

    public static BatchSaveInstructionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveInstructionStatusResponse self = new BatchSaveInstructionStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchSaveInstructionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSaveInstructionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSaveInstructionStatusResponse setBody(BatchSaveInstructionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSaveInstructionStatusResponseBody getBody() {
        return this.body;
    }

}
