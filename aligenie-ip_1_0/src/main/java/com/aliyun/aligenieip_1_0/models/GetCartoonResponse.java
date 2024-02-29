// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetCartoonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCartoonResponseBody body;

    public static GetCartoonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCartoonResponse self = new GetCartoonResponse();
        return TeaModel.build(map, self);
    }

    public GetCartoonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCartoonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCartoonResponse setBody(GetCartoonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCartoonResponseBody getBody() {
        return this.body;
    }

}
