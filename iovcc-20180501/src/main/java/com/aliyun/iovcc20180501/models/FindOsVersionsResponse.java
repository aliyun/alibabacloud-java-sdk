// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindOsVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindOsVersionsResponseBody body;

    public static FindOsVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        FindOsVersionsResponse self = new FindOsVersionsResponse();
        return TeaModel.build(map, self);
    }

    public FindOsVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindOsVersionsResponse setBody(FindOsVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public FindOsVersionsResponseBody getBody() {
        return this.body;
    }

}
