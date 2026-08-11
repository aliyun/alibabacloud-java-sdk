// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class UpdateModelLimitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelLimitsResponseBody body;

    public static UpdateModelLimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelLimitsResponse self = new UpdateModelLimitsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelLimitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelLimitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelLimitsResponse setBody(UpdateModelLimitsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelLimitsResponseBody getBody() {
        return this.body;
    }

}
