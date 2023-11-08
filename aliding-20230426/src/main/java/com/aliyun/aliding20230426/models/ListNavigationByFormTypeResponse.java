// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNavigationByFormTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListNavigationByFormTypeResponseBody body;

    public static ListNavigationByFormTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNavigationByFormTypeResponse self = new ListNavigationByFormTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListNavigationByFormTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNavigationByFormTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNavigationByFormTypeResponse setBody(ListNavigationByFormTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNavigationByFormTypeResponseBody getBody() {
        return this.body;
    }

}
