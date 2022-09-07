// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ConfirmIoTCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmIoTCloudConnectorResponseBody body;

    public static ConfirmIoTCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmIoTCloudConnectorResponse self = new ConfirmIoTCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmIoTCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmIoTCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmIoTCloudConnectorResponse setBody(ConfirmIoTCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
