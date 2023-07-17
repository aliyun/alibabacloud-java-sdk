// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListTraceAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTraceAppsResponseBody body;

    public static ListTraceAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsResponse self = new ListTraceAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListTraceAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTraceAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTraceAppsResponse setBody(ListTraceAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTraceAppsResponseBody getBody() {
        return this.body;
    }

}
