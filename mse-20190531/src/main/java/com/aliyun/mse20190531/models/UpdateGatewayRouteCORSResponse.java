// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayRouteCORSResponseBody body;

    public static UpdateGatewayRouteCORSResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteCORSResponse self = new UpdateGatewayRouteCORSResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteCORSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteCORSResponse setBody(UpdateGatewayRouteCORSResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteCORSResponseBody getBody() {
        return this.body;
    }

}
