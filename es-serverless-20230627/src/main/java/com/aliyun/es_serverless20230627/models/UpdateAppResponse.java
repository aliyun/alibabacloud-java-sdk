// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAppResponseBody body;

    public static UpdateAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppResponse self = new UpdateAppResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppResponse setBody(UpdateAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppResponseBody getBody() {
        return this.body;
    }

}
