// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class DeleteWirelessCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWirelessCloudConnectorResponseBody body;

    public static DeleteWirelessCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWirelessCloudConnectorResponse self = new DeleteWirelessCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWirelessCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWirelessCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWirelessCloudConnectorResponse setBody(DeleteWirelessCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWirelessCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
