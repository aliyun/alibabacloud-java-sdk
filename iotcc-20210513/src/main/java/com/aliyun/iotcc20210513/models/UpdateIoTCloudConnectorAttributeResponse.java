// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIoTCloudConnectorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateIoTCloudConnectorAttributeResponseBody body;

    public static UpdateIoTCloudConnectorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIoTCloudConnectorAttributeResponse self = new UpdateIoTCloudConnectorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIoTCloudConnectorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIoTCloudConnectorAttributeResponse setBody(UpdateIoTCloudConnectorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIoTCloudConnectorAttributeResponseBody getBody() {
        return this.body;
    }

}
