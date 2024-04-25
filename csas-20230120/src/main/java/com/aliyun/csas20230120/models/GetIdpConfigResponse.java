// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdpConfigResponseBody body;

    public static GetIdpConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdpConfigResponse self = new GetIdpConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetIdpConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdpConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdpConfigResponse setBody(GetIdpConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdpConfigResponseBody getBody() {
        return this.body;
    }

}
