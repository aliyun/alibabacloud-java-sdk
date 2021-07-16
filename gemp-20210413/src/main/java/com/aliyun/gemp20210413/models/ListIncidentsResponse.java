// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIncidentsResponseBody body;

    public static ListIncidentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentsResponse self = new ListIncidentsResponse();
        return TeaModel.build(map, self);
    }

    public ListIncidentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIncidentsResponse setBody(ListIncidentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIncidentsResponseBody getBody() {
        return this.body;
    }

}
