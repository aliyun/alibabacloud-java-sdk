// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterInspectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClusterInspectConfigResponseBody body;

    public static DeleteClusterInspectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterInspectConfigResponse self = new DeleteClusterInspectConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterInspectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterInspectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClusterInspectConfigResponse setBody(DeleteClusterInspectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterInspectConfigResponseBody getBody() {
        return this.body;
    }

}
