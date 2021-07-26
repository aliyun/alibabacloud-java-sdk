// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListOsVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOsVersionsResponseBody body;

    public static ListOsVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOsVersionsResponse self = new ListOsVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListOsVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOsVersionsResponse setBody(ListOsVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOsVersionsResponseBody getBody() {
        return this.body;
    }

}
