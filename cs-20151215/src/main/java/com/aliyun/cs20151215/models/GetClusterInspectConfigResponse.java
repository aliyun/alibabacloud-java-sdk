// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterInspectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterInspectConfigResponseBody body;

    public static GetClusterInspectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInspectConfigResponse self = new GetClusterInspectConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterInspectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterInspectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterInspectConfigResponse setBody(GetClusterInspectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterInspectConfigResponseBody getBody() {
        return this.body;
    }

}
