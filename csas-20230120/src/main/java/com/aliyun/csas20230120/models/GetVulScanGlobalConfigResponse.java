// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVulScanGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVulScanGlobalConfigResponseBody body;

    public static GetVulScanGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVulScanGlobalConfigResponse self = new GetVulScanGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVulScanGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVulScanGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVulScanGlobalConfigResponse setBody(GetVulScanGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVulScanGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
