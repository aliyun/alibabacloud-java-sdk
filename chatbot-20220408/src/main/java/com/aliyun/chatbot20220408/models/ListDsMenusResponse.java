// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDsMenusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDsMenusResponseBody body;

    public static ListDsMenusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDsMenusResponse self = new ListDsMenusResponse();
        return TeaModel.build(map, self);
    }

    public ListDsMenusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDsMenusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDsMenusResponse setBody(ListDsMenusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDsMenusResponseBody getBody() {
        return this.body;
    }

}
