// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class GetIoTCloudConnectorGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIoTCloudConnectorGatewayResponseBody body;

    public static GetIoTCloudConnectorGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIoTCloudConnectorGatewayResponse self = new GetIoTCloudConnectorGatewayResponse();
        return TeaModel.build(map, self);
    }

    public GetIoTCloudConnectorGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIoTCloudConnectorGatewayResponse setBody(GetIoTCloudConnectorGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIoTCloudConnectorGatewayResponseBody getBody() {
        return this.body;
    }

}
