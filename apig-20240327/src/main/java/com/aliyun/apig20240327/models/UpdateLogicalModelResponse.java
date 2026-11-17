// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateLogicalModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLogicalModelResponseBody body;

    public static UpdateLogicalModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogicalModelResponse self = new UpdateLogicalModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLogicalModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLogicalModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLogicalModelResponse setBody(UpdateLogicalModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLogicalModelResponseBody getBody() {
        return this.body;
    }

}
