// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateLargeModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLargeModelResponseBody body;

    public static UpdateLargeModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLargeModelResponse self = new UpdateLargeModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLargeModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLargeModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLargeModelResponse setBody(UpdateLargeModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLargeModelResponseBody getBody() {
        return this.body;
    }

}
