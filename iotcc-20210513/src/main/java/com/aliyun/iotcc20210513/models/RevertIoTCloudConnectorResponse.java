// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class RevertIoTCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevertIoTCloudConnectorResponseBody body;

    public static RevertIoTCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertIoTCloudConnectorResponse self = new RevertIoTCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public RevertIoTCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertIoTCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertIoTCloudConnectorResponse setBody(RevertIoTCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public RevertIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
