// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetAutoDisposeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoDisposeConfigResponseBody body;

    public static GetAutoDisposeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoDisposeConfigResponse self = new GetAutoDisposeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoDisposeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoDisposeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoDisposeConfigResponse setBody(GetAutoDisposeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoDisposeConfigResponseBody getBody() {
        return this.body;
    }

}
