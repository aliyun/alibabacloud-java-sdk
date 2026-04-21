// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAutoDisposeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoDisposeConfigResponseBody body;

    public static UpdateAutoDisposeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoDisposeConfigResponse self = new UpdateAutoDisposeConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoDisposeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoDisposeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoDisposeConfigResponse setBody(UpdateAutoDisposeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoDisposeConfigResponseBody getBody() {
        return this.body;
    }

}
