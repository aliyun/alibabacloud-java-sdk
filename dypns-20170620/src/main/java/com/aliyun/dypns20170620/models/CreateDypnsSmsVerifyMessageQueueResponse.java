// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyMessageQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDypnsSmsVerifyMessageQueueResponseBody body;

    public static CreateDypnsSmsVerifyMessageQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyMessageQueueResponse self = new CreateDypnsSmsVerifyMessageQueueResponse();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyMessageQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDypnsSmsVerifyMessageQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDypnsSmsVerifyMessageQueueResponse setBody(CreateDypnsSmsVerifyMessageQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDypnsSmsVerifyMessageQueueResponseBody getBody() {
        return this.body;
    }

}
