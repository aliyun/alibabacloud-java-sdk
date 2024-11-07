// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCodeSourceResponseBody body;

    public static UpdateCodeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCodeSourceResponse self = new UpdateCodeSourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCodeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCodeSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCodeSourceResponse setBody(UpdateCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCodeSourceResponseBody getBody() {
        return this.body;
    }

}
