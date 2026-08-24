// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVirusScanGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVirusScanGlobalConfigResponseBody body;

    public static UpdateVirusScanGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirusScanGlobalConfigResponse self = new UpdateVirusScanGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVirusScanGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVirusScanGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVirusScanGlobalConfigResponse setBody(UpdateVirusScanGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVirusScanGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
