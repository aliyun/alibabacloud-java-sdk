// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetContentResponseBody body;

    public static GetContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetContentResponse self = new GetContentResponse();
        return TeaModel.build(map, self);
    }

    public GetContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetContentResponse setBody(GetContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetContentResponseBody getBody() {
        return this.body;
    }

}
