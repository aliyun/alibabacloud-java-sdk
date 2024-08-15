// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListMonitorSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListMonitorSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMonitorSourcesResponse setBody(ListMonitorSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMonitorSourcesResponseBody getBody() {
        return this.body;
    }

}
