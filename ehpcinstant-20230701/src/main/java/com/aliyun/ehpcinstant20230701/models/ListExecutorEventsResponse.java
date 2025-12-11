// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListExecutorEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExecutorEventsResponseBody body;

    public static ListExecutorEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorEventsResponse self = new ListExecutorEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutorEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutorEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutorEventsResponse setBody(ListExecutorEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutorEventsResponseBody getBody() {
        return this.body;
    }

}
