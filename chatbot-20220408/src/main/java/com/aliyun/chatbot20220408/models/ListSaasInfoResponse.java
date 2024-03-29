// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSaasInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSaasInfoResponseBody body;

    public static ListSaasInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSaasInfoResponse self = new ListSaasInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListSaasInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSaasInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSaasInfoResponse setBody(ListSaasInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSaasInfoResponseBody getBody() {
        return this.body;
    }

}
