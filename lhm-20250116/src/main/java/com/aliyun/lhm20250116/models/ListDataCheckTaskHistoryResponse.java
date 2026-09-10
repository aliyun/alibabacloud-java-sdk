// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListDataCheckTaskHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataCheckTaskHistoryResponseBody body;

    public static ListDataCheckTaskHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataCheckTaskHistoryResponse self = new ListDataCheckTaskHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListDataCheckTaskHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataCheckTaskHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataCheckTaskHistoryResponse setBody(ListDataCheckTaskHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataCheckTaskHistoryResponseBody getBody() {
        return this.body;
    }

}
