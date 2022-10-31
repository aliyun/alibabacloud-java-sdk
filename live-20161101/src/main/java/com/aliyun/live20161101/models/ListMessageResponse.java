// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessageResponseBody body;

    public static ListMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageResponse self = new ListMessageResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageResponse setBody(ListMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageResponseBody getBody() {
        return this.body;
    }

}
