// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsPartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsPartitionsResponseBody body;

    public static ListMmsPartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsPartitionsResponse self = new ListMmsPartitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsPartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsPartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsPartitionsResponse setBody(ListMmsPartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsPartitionsResponseBody getBody() {
        return this.body;
    }

}
