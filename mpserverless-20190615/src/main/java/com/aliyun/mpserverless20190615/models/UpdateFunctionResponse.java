// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFunctionResponseBody body;

    public static UpdateFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResponse self = new UpdateFunctionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFunctionResponse setBody(UpdateFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionResponseBody getBody() {
        return this.body;
    }

}
