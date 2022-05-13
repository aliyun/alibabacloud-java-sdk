// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewaySlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGatewaySlbResponseBody body;

    public static ListGatewaySlbResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaySlbResponse self = new ListGatewaySlbResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewaySlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewaySlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGatewaySlbResponse setBody(ListGatewaySlbResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewaySlbResponseBody getBody() {
        return this.body;
    }

}
