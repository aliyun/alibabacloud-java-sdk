// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateVulScanGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVulScanGlobalConfigResponseBody body;

    public static UpdateVulScanGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVulScanGlobalConfigResponse self = new UpdateVulScanGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVulScanGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVulScanGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVulScanGlobalConfigResponse setBody(UpdateVulScanGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVulScanGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
