// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListMethodsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMethodsResponseBody body;

    public static ListMethodsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMethodsResponse self = new ListMethodsResponse();
        return TeaModel.build(map, self);
    }

    public ListMethodsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMethodsResponse setBody(ListMethodsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMethodsResponseBody getBody() {
        return this.body;
    }

}
