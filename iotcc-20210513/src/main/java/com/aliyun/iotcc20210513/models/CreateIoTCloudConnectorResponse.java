// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateIoTCloudConnectorResponseBody body;

    public static CreateIoTCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorResponse self = new CreateIoTCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIoTCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIoTCloudConnectorResponse setBody(CreateIoTCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
