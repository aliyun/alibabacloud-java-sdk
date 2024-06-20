// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetWmEmbedTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWmEmbedTaskResponseBody body;

    public static GetWmEmbedTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWmEmbedTaskResponse self = new GetWmEmbedTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetWmEmbedTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWmEmbedTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWmEmbedTaskResponse setBody(GetWmEmbedTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWmEmbedTaskResponseBody getBody() {
        return this.body;
    }

}
