// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayFeaturesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGatewayFeaturesResponseBody body;

    public static ListGatewayFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayFeaturesResponse self = new ListGatewayFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayFeaturesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayFeaturesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewayFeaturesResponse setBody(ListGatewayFeaturesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayFeaturesResponseBody getBody() {
        return this.body;
    }

}
