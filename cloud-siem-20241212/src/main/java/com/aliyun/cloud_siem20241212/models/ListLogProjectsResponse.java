// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListLogProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLogProjectsResponseBody body;

    public static ListLogProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogProjectsResponse self = new ListLogProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListLogProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogProjectsResponse setBody(ListLogProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogProjectsResponseBody getBody() {
        return this.body;
    }

}
