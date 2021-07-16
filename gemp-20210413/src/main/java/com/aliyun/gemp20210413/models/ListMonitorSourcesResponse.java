// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListMonitorSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMonitorSourcesResponseBody body;

    public static ListMonitorSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorSourcesResponse self = new ListMonitorSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListMonitorSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMonitorSourcesResponse setBody(ListMonitorSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMonitorSourcesResponseBody getBody() {
        return this.body;
    }

}
