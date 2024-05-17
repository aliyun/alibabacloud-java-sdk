// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListInstanceExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceExtensionsResponseBody body;

    public static ListInstanceExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceExtensionsResponse self = new ListInstanceExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceExtensionsResponse setBody(ListInstanceExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceExtensionsResponseBody getBody() {
        return this.body;
    }

}
