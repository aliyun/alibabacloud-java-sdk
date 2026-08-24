// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetVirusScanGlobalConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVirusScanGlobalConfigResponseBody body;

    public static GetVirusScanGlobalConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVirusScanGlobalConfigResponse self = new GetVirusScanGlobalConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVirusScanGlobalConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVirusScanGlobalConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVirusScanGlobalConfigResponse setBody(GetVirusScanGlobalConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVirusScanGlobalConfigResponseBody getBody() {
        return this.body;
    }

}
