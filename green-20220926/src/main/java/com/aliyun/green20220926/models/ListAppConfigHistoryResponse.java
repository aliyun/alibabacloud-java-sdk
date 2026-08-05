// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAppConfigHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppConfigHistoryResponseBody body;

    public static ListAppConfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppConfigHistoryResponse self = new ListAppConfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListAppConfigHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppConfigHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppConfigHistoryResponse setBody(ListAppConfigHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppConfigHistoryResponseBody getBody() {
        return this.body;
    }

}
