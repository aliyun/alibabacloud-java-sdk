// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGatewayServiceResponseBody body;

    public static ListGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServiceResponse self = new ListGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGatewayServiceResponse setBody(ListGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
