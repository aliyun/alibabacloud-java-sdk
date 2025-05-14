// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterInspectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterInspectConfigResponseBody body;

    public static UpdateClusterInspectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterInspectConfigResponse self = new UpdateClusterInspectConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterInspectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterInspectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterInspectConfigResponse setBody(UpdateClusterInspectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterInspectConfigResponseBody getBody() {
        return this.body;
    }

}
