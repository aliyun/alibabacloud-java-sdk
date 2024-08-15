// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSourceEventsResponseBody body;

    public static ListSourceEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsResponse self = new ListSourceEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSourceEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSourceEventsResponse setBody(ListSourceEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSourceEventsResponseBody getBody() {
        return this.body;
    }

}
