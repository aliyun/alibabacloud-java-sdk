// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class EnableIoTCloudConnectorAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableIoTCloudConnectorAccessLogResponseBody body;

    public static EnableIoTCloudConnectorAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableIoTCloudConnectorAccessLogResponse self = new EnableIoTCloudConnectorAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public EnableIoTCloudConnectorAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableIoTCloudConnectorAccessLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableIoTCloudConnectorAccessLogResponse setBody(EnableIoTCloudConnectorAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableIoTCloudConnectorAccessLogResponseBody getBody() {
        return this.body;
    }

}
