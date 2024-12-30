// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStreamBatchJobMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateStreamBatchJobMappingResponseBody body;

    public static CreateStreamBatchJobMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamBatchJobMappingResponse self = new CreateStreamBatchJobMappingResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamBatchJobMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamBatchJobMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStreamBatchJobMappingResponse setBody(CreateStreamBatchJobMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamBatchJobMappingResponseBody getBody() {
        return this.body;
    }

}
