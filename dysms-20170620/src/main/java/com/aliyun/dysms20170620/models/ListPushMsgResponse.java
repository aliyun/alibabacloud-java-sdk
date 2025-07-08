// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ListPushMsgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPushMsgResponseBody body;

    public static ListPushMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPushMsgResponse self = new ListPushMsgResponse();
        return TeaModel.build(map, self);
    }

    public ListPushMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPushMsgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPushMsgResponse setBody(ListPushMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPushMsgResponseBody getBody() {
        return this.body;
    }

}
