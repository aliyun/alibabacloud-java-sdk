// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyMessageCallBackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDypnsSmsVerifyMessageCallBackResponseBody body;

    public static CreateDypnsSmsVerifyMessageCallBackResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyMessageCallBackResponse self = new CreateDypnsSmsVerifyMessageCallBackResponse();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyMessageCallBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDypnsSmsVerifyMessageCallBackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDypnsSmsVerifyMessageCallBackResponse setBody(CreateDypnsSmsVerifyMessageCallBackResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDypnsSmsVerifyMessageCallBackResponseBody getBody() {
        return this.body;
    }

}
