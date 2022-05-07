// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIoTCloudConnectorGroupAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIoTCloudConnectorGroupAttributeResponseBody body;

    public static UpdateIoTCloudConnectorGroupAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIoTCloudConnectorGroupAttributeResponse self = new UpdateIoTCloudConnectorGroupAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIoTCloudConnectorGroupAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIoTCloudConnectorGroupAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIoTCloudConnectorGroupAttributeResponse setBody(UpdateIoTCloudConnectorGroupAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIoTCloudConnectorGroupAttributeResponseBody getBody() {
        return this.body;
    }

}
