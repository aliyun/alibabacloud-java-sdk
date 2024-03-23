// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateModelVersionResponseBody body;

    public static UpdateModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelVersionResponse self = new UpdateModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateModelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateModelVersionResponse setBody(UpdateModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateModelVersionResponseBody getBody() {
        return this.body;
    }

}
