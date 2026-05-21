// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListOperationEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationEventsResponseBody body;

    public static ListOperationEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationEventsResponse self = new ListOperationEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationEventsResponse setBody(ListOperationEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationEventsResponseBody getBody() {
        return this.body;
    }

}
