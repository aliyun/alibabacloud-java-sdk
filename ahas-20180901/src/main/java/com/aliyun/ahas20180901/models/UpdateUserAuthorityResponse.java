// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateUserAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserAuthorityResponseBody body;

    public static UpdateUserAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAuthorityResponse self = new UpdateUserAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateUserAuthorityResponse setBody(UpdateUserAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserAuthorityResponseBody getBody() {
        return this.body;
    }

}
