// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallbackResponseBody body;

    public static ListCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallbackResponse self = new ListCallbackResponse();
        return TeaModel.build(map, self);
    }

    public ListCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallbackResponse setBody(ListCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallbackResponseBody getBody() {
        return this.body;
    }

}
