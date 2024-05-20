// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetResourcePublicIPsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourcePublicIPsResponseBody body;

    public static GetResourcePublicIPsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePublicIPsResponse self = new GetResourcePublicIPsResponse();
        return TeaModel.build(map, self);
    }

    public GetResourcePublicIPsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourcePublicIPsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourcePublicIPsResponse setBody(GetResourcePublicIPsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourcePublicIPsResponseBody getBody() {
        return this.body;
    }

}
