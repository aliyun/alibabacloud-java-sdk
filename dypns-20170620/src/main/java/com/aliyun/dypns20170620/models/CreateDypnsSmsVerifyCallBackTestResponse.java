// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyCallBackTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDypnsSmsVerifyCallBackTestResponseBody body;

    public static CreateDypnsSmsVerifyCallBackTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyCallBackTestResponse self = new CreateDypnsSmsVerifyCallBackTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyCallBackTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDypnsSmsVerifyCallBackTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDypnsSmsVerifyCallBackTestResponse setBody(CreateDypnsSmsVerifyCallBackTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDypnsSmsVerifyCallBackTestResponseBody getBody() {
        return this.body;
    }

}
