// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationsResponseBody body;

    public static ListOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationsResponse self = new ListOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationsResponse setBody(ListOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationsResponseBody getBody() {
        return this.body;
    }

}
