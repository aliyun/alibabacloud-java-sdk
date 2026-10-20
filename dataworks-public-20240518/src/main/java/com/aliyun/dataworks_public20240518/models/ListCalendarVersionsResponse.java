// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCalendarVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCalendarVersionsResponseBody body;

    public static ListCalendarVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarVersionsResponse self = new ListCalendarVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListCalendarVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCalendarVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCalendarVersionsResponse setBody(ListCalendarVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCalendarVersionsResponseBody getBody() {
        return this.body;
    }

}
