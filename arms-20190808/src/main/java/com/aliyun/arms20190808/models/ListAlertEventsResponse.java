// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListAlertEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertEventsResponseBody body;

    public static ListAlertEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertEventsResponse self = new ListAlertEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertEventsResponse setBody(ListAlertEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertEventsResponseBody getBody() {
        return this.body;
    }

}
