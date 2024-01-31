// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateControlPlaneLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateControlPlaneLogResponseBody body;

    public static UpdateControlPlaneLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateControlPlaneLogResponse self = new UpdateControlPlaneLogResponse();
        return TeaModel.build(map, self);
    }

    public UpdateControlPlaneLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateControlPlaneLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateControlPlaneLogResponse setBody(UpdateControlPlaneLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateControlPlaneLogResponseBody getBody() {
        return this.body;
    }

}
