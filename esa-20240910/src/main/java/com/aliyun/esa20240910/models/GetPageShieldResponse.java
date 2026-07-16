// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPageShieldResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPageShieldResponseBody body;

    public static GetPageShieldResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageShieldResponse self = new GetPageShieldResponse();
        return TeaModel.build(map, self);
    }

    public GetPageShieldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageShieldResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPageShieldResponse setBody(GetPageShieldResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageShieldResponseBody getBody() {
        return this.body;
    }

}
