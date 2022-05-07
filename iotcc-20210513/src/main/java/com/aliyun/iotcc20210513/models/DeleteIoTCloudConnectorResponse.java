// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DeleteIoTCloudConnectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIoTCloudConnectorResponseBody body;

    public static DeleteIoTCloudConnectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIoTCloudConnectorResponse self = new DeleteIoTCloudConnectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIoTCloudConnectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIoTCloudConnectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIoTCloudConnectorResponse setBody(DeleteIoTCloudConnectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

}
