// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventHouseRuntimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventHouseRuntimesResponseBody body;

    public static ListEventHouseRuntimesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventHouseRuntimesResponse self = new ListEventHouseRuntimesResponse();
        return TeaModel.build(map, self);
    }

    public ListEventHouseRuntimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventHouseRuntimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventHouseRuntimesResponse setBody(ListEventHouseRuntimesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventHouseRuntimesResponseBody getBody() {
        return this.body;
    }

}
