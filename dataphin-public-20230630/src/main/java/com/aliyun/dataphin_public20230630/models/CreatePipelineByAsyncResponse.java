// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreatePipelineByAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePipelineByAsyncResponseBody body;

    public static CreatePipelineByAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineByAsyncResponse self = new CreatePipelineByAsyncResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineByAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineByAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineByAsyncResponse setBody(CreatePipelineByAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineByAsyncResponseBody getBody() {
        return this.body;
    }

}
