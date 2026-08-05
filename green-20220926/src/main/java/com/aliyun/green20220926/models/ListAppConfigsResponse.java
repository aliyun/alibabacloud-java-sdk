// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListAppConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppConfigsResponseBody body;

    public static ListAppConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppConfigsResponse self = new ListAppConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppConfigsResponse setBody(ListAppConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppConfigsResponseBody getBody() {
        return this.body;
    }

}
