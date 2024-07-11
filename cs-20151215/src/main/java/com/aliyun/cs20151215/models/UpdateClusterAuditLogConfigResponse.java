// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateClusterAuditLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateClusterAuditLogConfigResponseBody body;

    public static UpdateClusterAuditLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAuditLogConfigResponse self = new UpdateClusterAuditLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAuditLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterAuditLogConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateClusterAuditLogConfigResponse setBody(UpdateClusterAuditLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterAuditLogConfigResponseBody getBody() {
        return this.body;
    }

}
