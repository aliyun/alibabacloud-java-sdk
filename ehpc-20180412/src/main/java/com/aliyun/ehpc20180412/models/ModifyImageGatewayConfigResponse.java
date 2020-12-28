// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyImageGatewayConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyImageGatewayConfigResponseBody body;

    public static ModifyImageGatewayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageGatewayConfigResponse self = new ModifyImageGatewayConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageGatewayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageGatewayConfigResponse setBody(ModifyImageGatewayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageGatewayConfigResponseBody getBody() {
        return this.body;
    }

}
