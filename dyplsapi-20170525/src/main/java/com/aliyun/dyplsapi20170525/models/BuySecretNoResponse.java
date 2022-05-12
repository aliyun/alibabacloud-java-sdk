// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BuySecretNoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BuySecretNoResponseBody body;

    public static BuySecretNoResponse build(java.util.Map<String, ?> map) throws Exception {
        BuySecretNoResponse self = new BuySecretNoResponse();
        return TeaModel.build(map, self);
    }

    public BuySecretNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuySecretNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuySecretNoResponse setBody(BuySecretNoResponseBody body) {
        this.body = body;
        return this;
    }
    public BuySecretNoResponseBody getBody() {
        return this.body;
    }

}
