// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetWirelessCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWirelessCloudConnectorResponseBody body;

    public static GetWirelessCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWirelessCloudConnectorResponse self = new GetWirelessCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public GetWirelessCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWirelessCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWirelessCloudConnectorResponse setBody(GetWirelessCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
