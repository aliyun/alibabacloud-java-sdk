// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListLogRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogRegionsResponseBody body;

    public static ListLogRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogRegionsResponse self = new ListLogRegionsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogRegionsResponse setBody(ListLogRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogRegionsResponseBody getBody() {
        return this.body;
    }

}
