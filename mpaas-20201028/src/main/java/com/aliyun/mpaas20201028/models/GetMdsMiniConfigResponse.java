// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class GetMdsMiniConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMdsMiniConfigResponseBody body;

    public static GetMdsMiniConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMdsMiniConfigResponse self = new GetMdsMiniConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMdsMiniConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMdsMiniConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMdsMiniConfigResponse setBody(GetMdsMiniConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMdsMiniConfigResponseBody getBody() {
        return this.body;
    }

}
