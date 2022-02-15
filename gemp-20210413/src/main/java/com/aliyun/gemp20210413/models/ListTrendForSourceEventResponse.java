// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListTrendForSourceEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrendForSourceEventResponseBody body;

    public static ListTrendForSourceEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrendForSourceEventResponse self = new ListTrendForSourceEventResponse();
        return TeaModel.build(map, self);
    }

    public ListTrendForSourceEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrendForSourceEventResponse setBody(ListTrendForSourceEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrendForSourceEventResponseBody getBody() {
        return this.body;
    }

}
