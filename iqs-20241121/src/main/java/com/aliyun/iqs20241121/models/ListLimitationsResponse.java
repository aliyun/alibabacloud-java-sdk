// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListLimitationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLimitationsResponseBody body;

    public static ListLimitationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLimitationsResponse self = new ListLimitationsResponse();
        return TeaModel.build(map, self);
    }

    public ListLimitationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLimitationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLimitationsResponse setBody(ListLimitationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLimitationsResponseBody getBody() {
        return this.body;
    }

}
