// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteGatewaySlbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewaySlbResponseBody body;

    public static DeleteGatewaySlbResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewaySlbResponse self = new DeleteGatewaySlbResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewaySlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewaySlbResponse setBody(DeleteGatewaySlbResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewaySlbResponseBody getBody() {
        return this.body;
    }

}
