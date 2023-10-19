// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveApiProductsAuthoritiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveApiProductsAuthoritiesResponseBody body;

    public static RemoveApiProductsAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveApiProductsAuthoritiesResponse self = new RemoveApiProductsAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveApiProductsAuthoritiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveApiProductsAuthoritiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveApiProductsAuthoritiesResponse setBody(RemoveApiProductsAuthoritiesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveApiProductsAuthoritiesResponseBody getBody() {
        return this.body;
    }

}
