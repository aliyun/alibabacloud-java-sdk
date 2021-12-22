// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AddCloudConnectorGatewayPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCloudConnectorGatewayPrivilegeResponseBody body;

    public static AddCloudConnectorGatewayPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCloudConnectorGatewayPrivilegeResponse self = new AddCloudConnectorGatewayPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public AddCloudConnectorGatewayPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCloudConnectorGatewayPrivilegeResponse setBody(AddCloudConnectorGatewayPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCloudConnectorGatewayPrivilegeResponseBody getBody() {
        return this.body;
    }

}
