// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListPlayHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPlayHistoryResponseBody body;

    public static ListPlayHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPlayHistoryResponse self = new ListPlayHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListPlayHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPlayHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPlayHistoryResponse setBody(ListPlayHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPlayHistoryResponseBody getBody() {
        return this.body;
    }

}
