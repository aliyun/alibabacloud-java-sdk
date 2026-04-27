// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListForwardStrategiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListForwardStrategiesResponseBody body;

    public static ListForwardStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListForwardStrategiesResponse self = new ListForwardStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public ListForwardStrategiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListForwardStrategiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListForwardStrategiesResponse setBody(ListForwardStrategiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListForwardStrategiesResponseBody getBody() {
        return this.body;
    }

}
