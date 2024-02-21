// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceHistoryEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceHistoryEventsResponseBody body;

    public static ListInstanceHistoryEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceHistoryEventsResponse self = new ListInstanceHistoryEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceHistoryEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceHistoryEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceHistoryEventsResponse setBody(ListInstanceHistoryEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceHistoryEventsResponseBody getBody() {
        return this.body;
    }

}
