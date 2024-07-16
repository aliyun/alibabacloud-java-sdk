// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateWirelessCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWirelessCloudConnectorResponseBody body;

    public static UpdateWirelessCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWirelessCloudConnectorResponse self = new UpdateWirelessCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWirelessCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWirelessCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWirelessCloudConnectorResponse setBody(UpdateWirelessCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
