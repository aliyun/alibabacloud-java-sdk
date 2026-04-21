// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateAutoDisposeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoDisposeConfigResponseBody body;

    public static CreateAutoDisposeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoDisposeConfigResponse self = new CreateAutoDisposeConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoDisposeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoDisposeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoDisposeConfigResponse setBody(CreateAutoDisposeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoDisposeConfigResponseBody getBody() {
        return this.body;
    }

}
