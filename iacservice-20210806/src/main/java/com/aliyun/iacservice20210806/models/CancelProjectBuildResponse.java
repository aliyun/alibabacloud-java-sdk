// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CancelProjectBuildResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelProjectBuildResponseBody body;

    public static CancelProjectBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelProjectBuildResponse self = new CancelProjectBuildResponse();
        return TeaModel.build(map, self);
    }

    public CancelProjectBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelProjectBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelProjectBuildResponse setBody(CancelProjectBuildResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelProjectBuildResponseBody getBody() {
        return this.body;
    }

}
