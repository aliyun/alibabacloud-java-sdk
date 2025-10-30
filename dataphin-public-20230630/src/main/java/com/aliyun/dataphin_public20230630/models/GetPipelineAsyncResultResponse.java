// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPipelineAsyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPipelineAsyncResultResponseBody body;

    public static GetPipelineAsyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineAsyncResultResponse self = new GetPipelineAsyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineAsyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineAsyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPipelineAsyncResultResponse setBody(GetPipelineAsyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineAsyncResultResponseBody getBody() {
        return this.body;
    }

}
