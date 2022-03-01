// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewayServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayServiceResponseBody body;

    public static DeleteGatewayServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayServiceResponse self = new DeleteGatewayServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayServiceResponse setBody(DeleteGatewayServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayServiceResponseBody getBody() {
        return this.body;
    }

}
