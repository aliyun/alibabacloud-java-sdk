// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAvatarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAvatarResponseBody body;

    public static GetAvatarResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvatarResponse self = new GetAvatarResponse();
        return TeaModel.build(map, self);
    }

    public GetAvatarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvatarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvatarResponse setBody(GetAvatarResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvatarResponseBody getBody() {
        return this.body;
    }

}
