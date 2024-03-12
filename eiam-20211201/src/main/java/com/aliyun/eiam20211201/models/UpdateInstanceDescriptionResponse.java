// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstanceDescriptionResponseBody body;

    public static UpdateInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceDescriptionResponse self = new UpdateInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceDescriptionResponse setBody(UpdateInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
