// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListKvsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKvsResponseBody body;

    public static ListKvsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKvsResponse self = new ListKvsResponse();
        return TeaModel.build(map, self);
    }

    public ListKvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKvsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKvsResponse setBody(ListKvsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKvsResponseBody getBody() {
        return this.body;
    }

}
