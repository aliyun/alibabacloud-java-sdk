// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetInstanceDownStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceDownStreamResponseBody body;

    public static GetInstanceDownStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceDownStreamResponse self = new GetInstanceDownStreamResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceDownStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceDownStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceDownStreamResponse setBody(GetInstanceDownStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceDownStreamResponseBody getBody() {
        return this.body;
    }

}
