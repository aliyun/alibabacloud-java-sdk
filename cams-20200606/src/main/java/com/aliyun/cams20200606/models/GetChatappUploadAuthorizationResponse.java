// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappUploadAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetChatappUploadAuthorizationResponseBody body;

    public static GetChatappUploadAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChatappUploadAuthorizationResponse self = new GetChatappUploadAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public GetChatappUploadAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChatappUploadAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetChatappUploadAuthorizationResponse setBody(GetChatappUploadAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChatappUploadAuthorizationResponseBody getBody() {
        return this.body;
    }

}
