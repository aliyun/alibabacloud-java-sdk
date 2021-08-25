// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListIoTCloudConnectorGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIoTCloudConnectorGatewaysResponseBody body;

    public static ListIoTCloudConnectorGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIoTCloudConnectorGatewaysResponse self = new ListIoTCloudConnectorGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public ListIoTCloudConnectorGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIoTCloudConnectorGatewaysResponse setBody(ListIoTCloudConnectorGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIoTCloudConnectorGatewaysResponseBody getBody() {
        return this.body;
    }

}
