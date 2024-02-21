// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDescriptionResponseBody body;

    public static UpdateDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDescriptionResponse self = new UpdateDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDescriptionResponse setBody(UpdateDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDescriptionResponseBody getBody() {
        return this.body;
    }

}
