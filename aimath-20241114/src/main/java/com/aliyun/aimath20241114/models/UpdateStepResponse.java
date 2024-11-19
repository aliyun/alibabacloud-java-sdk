// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class UpdateStepResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStepResponseBody body;

    public static UpdateStepResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStepResponse self = new UpdateStepResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStepResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStepResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStepResponse setBody(UpdateStepResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStepResponseBody getBody() {
        return this.body;
    }

}
