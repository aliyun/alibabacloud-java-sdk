// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExtensionsResponseBody body;

    public static ListExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExtensionsResponse self = new ListExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public ListExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExtensionsResponse setBody(ListExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExtensionsResponseBody getBody() {
        return this.body;
    }

}
