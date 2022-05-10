// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimModelConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBimModelConfigResponseBody body;

    public static UpdateBimModelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimModelConfigResponse self = new UpdateBimModelConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBimModelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBimModelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBimModelConfigResponse setBody(UpdateBimModelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBimModelConfigResponseBody getBody() {
        return this.body;
    }

}
