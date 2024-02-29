// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceHistoryResponseBody body;

    public static ListInstanceHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryResponse self = new ListInstanceHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceHistoryResponse setBody(ListInstanceHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceHistoryResponseBody getBody() {
        return this.body;
    }

}
