// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListCloudConnectorGatewayPrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCloudConnectorGatewayPrivilegeResponseBody body;

    public static ListCloudConnectorGatewayPrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudConnectorGatewayPrivilegeResponse self = new ListCloudConnectorGatewayPrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudConnectorGatewayPrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCloudConnectorGatewayPrivilegeResponse setBody(ListCloudConnectorGatewayPrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCloudConnectorGatewayPrivilegeResponseBody getBody() {
        return this.body;
    }

}
