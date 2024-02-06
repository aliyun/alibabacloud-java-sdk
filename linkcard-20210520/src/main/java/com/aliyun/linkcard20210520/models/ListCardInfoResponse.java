// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListCardInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCardInfoResponseBody body;

    public static ListCardInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCardInfoResponse self = new ListCardInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListCardInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCardInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCardInfoResponse setBody(ListCardInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCardInfoResponseBody getBody() {
        return this.body;
    }

}
