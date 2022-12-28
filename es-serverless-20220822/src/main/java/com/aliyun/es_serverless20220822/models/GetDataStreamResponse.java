// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class GetDataStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataStreamResponseBody body;

    public static GetDataStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataStreamResponse self = new GetDataStreamResponse();
        return TeaModel.build(map, self);
    }

    public GetDataStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataStreamResponse setBody(GetDataStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataStreamResponseBody getBody() {
        return this.body;
    }

}
