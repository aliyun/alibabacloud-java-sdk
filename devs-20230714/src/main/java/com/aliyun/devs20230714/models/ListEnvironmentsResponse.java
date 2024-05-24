// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnvironmentsResponseBody body;

    public static ListEnvironmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponse self = new ListEnvironmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnvironmentsResponse setBody(ListEnvironmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvironmentsResponseBody getBody() {
        return this.body;
    }

}
