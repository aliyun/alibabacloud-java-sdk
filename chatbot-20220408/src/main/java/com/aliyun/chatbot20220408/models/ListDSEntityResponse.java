// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDSEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDSEntityResponseBody body;

    public static ListDSEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSEntityResponse self = new ListDSEntityResponse();
        return TeaModel.build(map, self);
    }

    public ListDSEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDSEntityResponse setBody(ListDSEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSEntityResponseBody getBody() {
        return this.body;
    }

}
