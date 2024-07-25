// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewaysResponseBody body;

    public static ListGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaysResponse self = new ListGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewaysResponse setBody(ListGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewaysResponseBody getBody() {
        return this.body;
    }

}
