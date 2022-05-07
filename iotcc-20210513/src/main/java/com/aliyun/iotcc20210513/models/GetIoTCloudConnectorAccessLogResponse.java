// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetIoTCloudConnectorAccessLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIoTCloudConnectorAccessLogResponseBody body;

    public static GetIoTCloudConnectorAccessLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIoTCloudConnectorAccessLogResponse self = new GetIoTCloudConnectorAccessLogResponse();
        return TeaModel.build(map, self);
    }

    public GetIoTCloudConnectorAccessLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIoTCloudConnectorAccessLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIoTCloudConnectorAccessLogResponse setBody(GetIoTCloudConnectorAccessLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIoTCloudConnectorAccessLogResponseBody getBody() {
        return this.body;
    }

}
