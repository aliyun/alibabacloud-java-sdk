// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetApiProductsAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetApiProductsAuthoritiesResponseBody body;

    public static SetApiProductsAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetApiProductsAuthoritiesResponse self = new SetApiProductsAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public SetApiProductsAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetApiProductsAuthoritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetApiProductsAuthoritiesResponse setBody(SetApiProductsAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetApiProductsAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
