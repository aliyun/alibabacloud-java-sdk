// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class DisableIoTCloudConnectorAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableIoTCloudConnectorAccessLogResponseBody body;

    public static DisableIoTCloudConnectorAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableIoTCloudConnectorAccessLogResponse self = new DisableIoTCloudConnectorAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public DisableIoTCloudConnectorAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableIoTCloudConnectorAccessLogResponse setBody(DisableIoTCloudConnectorAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableIoTCloudConnectorAccessLogResponseBody getBody() {
        return this.body;
    }

}
