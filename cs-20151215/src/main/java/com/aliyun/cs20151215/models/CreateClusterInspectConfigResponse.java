// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CreateClusterInspectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClusterInspectConfigResponseBody body;

    public static CreateClusterInspectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterInspectConfigResponse self = new CreateClusterInspectConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterInspectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterInspectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClusterInspectConfigResponse setBody(CreateClusterInspectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterInspectConfigResponseBody getBody() {
        return this.body;
    }

}
