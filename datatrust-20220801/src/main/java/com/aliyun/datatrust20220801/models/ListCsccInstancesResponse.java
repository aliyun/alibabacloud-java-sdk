// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccInstancesResponseBody body;

    public static ListCsccInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccInstancesResponse self = new ListCsccInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccInstancesResponse setBody(ListCsccInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccInstancesResponseBody getBody() {
        return this.body;
    }

}
