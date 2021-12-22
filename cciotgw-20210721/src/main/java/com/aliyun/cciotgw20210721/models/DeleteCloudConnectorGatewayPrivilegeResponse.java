// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class DeleteCloudConnectorGatewayPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCloudConnectorGatewayPrivilegeResponseBody body;

    public static DeleteCloudConnectorGatewayPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudConnectorGatewayPrivilegeResponse self = new DeleteCloudConnectorGatewayPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudConnectorGatewayPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudConnectorGatewayPrivilegeResponse setBody(DeleteCloudConnectorGatewayPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudConnectorGatewayPrivilegeResponseBody getBody() {
        return this.body;
    }

}
