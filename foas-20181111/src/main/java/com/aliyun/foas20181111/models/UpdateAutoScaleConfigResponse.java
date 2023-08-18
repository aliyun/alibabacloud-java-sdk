// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class UpdateAutoScaleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAutoScaleConfigResponseBody body;

    public static UpdateAutoScaleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoScaleConfigResponse self = new UpdateAutoScaleConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoScaleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoScaleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoScaleConfigResponse setBody(UpdateAutoScaleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoScaleConfigResponseBody getBody() {
        return this.body;
    }

}
