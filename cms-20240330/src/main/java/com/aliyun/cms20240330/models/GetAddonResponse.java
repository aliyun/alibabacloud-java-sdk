// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAddonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAddonResponseBody body;

    public static GetAddonResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddonResponse self = new GetAddonResponse();
        return TeaModel.build(map, self);
    }

    public GetAddonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAddonResponse setBody(GetAddonResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddonResponseBody getBody() {
        return this.body;
    }

}
