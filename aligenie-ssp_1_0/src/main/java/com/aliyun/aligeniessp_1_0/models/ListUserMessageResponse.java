// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListUserMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserMessageResponseBody body;

    public static ListUserMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserMessageResponse self = new ListUserMessageResponse();
        return TeaModel.build(map, self);
    }

    public ListUserMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserMessageResponse setBody(ListUserMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserMessageResponseBody getBody() {
        return this.body;
    }

}
