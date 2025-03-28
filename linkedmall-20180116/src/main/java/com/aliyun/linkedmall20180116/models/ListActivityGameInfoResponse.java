// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListActivityGameInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListActivityGameInfoResponseBody body;

    public static ListActivityGameInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListActivityGameInfoResponse self = new ListActivityGameInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListActivityGameInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListActivityGameInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListActivityGameInfoResponse setBody(ListActivityGameInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListActivityGameInfoResponseBody getBody() {
        return this.body;
    }

}
