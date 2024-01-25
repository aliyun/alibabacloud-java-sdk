// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductEnvironmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProductEnvironmentsResponseBody body;

    public static ListProductEnvironmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvironmentsResponse self = new ListProductEnvironmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductEnvironmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductEnvironmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductEnvironmentsResponse setBody(ListProductEnvironmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductEnvironmentsResponseBody getBody() {
        return this.body;
    }

}
