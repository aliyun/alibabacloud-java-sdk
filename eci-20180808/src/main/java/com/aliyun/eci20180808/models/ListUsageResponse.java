// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ListUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUsageResponseBody body;

    public static ListUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsageResponse self = new ListUsageResponse();
        return TeaModel.build(map, self);
    }

    public ListUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUsageResponse setBody(ListUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsageResponseBody getBody() {
        return this.body;
    }

}
