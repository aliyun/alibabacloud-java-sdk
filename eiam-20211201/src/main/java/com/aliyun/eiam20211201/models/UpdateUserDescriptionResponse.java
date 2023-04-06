// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateUserDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserDescriptionResponseBody body;

    public static UpdateUserDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDescriptionResponse self = new UpdateUserDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserDescriptionResponse setBody(UpdateUserDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserDescriptionResponseBody getBody() {
        return this.body;
    }

}
