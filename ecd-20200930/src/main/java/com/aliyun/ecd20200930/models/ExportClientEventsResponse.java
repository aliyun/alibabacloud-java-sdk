// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ExportClientEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportClientEventsResponseBody body;

    public static ExportClientEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportClientEventsResponse self = new ExportClientEventsResponse();
        return TeaModel.build(map, self);
    }

    public ExportClientEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportClientEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportClientEventsResponse setBody(ExportClientEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportClientEventsResponseBody getBody() {
        return this.body;
    }

}
