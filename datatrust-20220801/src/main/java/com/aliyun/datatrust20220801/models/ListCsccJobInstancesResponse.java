// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccJobInstancesResponseBody body;

    public static ListCsccJobInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobInstancesResponse self = new ListCsccJobInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccJobInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccJobInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccJobInstancesResponse setBody(ListCsccJobInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccJobInstancesResponseBody getBody() {
        return this.body;
    }

}
