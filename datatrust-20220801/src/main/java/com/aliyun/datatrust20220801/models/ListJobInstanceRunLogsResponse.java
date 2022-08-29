// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListJobInstanceRunLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListJobInstanceRunLogsResponseBody body;

    public static ListJobInstanceRunLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstanceRunLogsResponse self = new ListJobInstanceRunLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListJobInstanceRunLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobInstanceRunLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobInstanceRunLogsResponse setBody(ListJobInstanceRunLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobInstanceRunLogsResponseBody getBody() {
        return this.body;
    }

}
