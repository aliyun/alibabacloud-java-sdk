// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FraudResultCallBackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FraudResultCallBackResponseBody body;

    public static FraudResultCallBackResponse build(java.util.Map<String, ?> map) throws Exception {
        FraudResultCallBackResponse self = new FraudResultCallBackResponse();
        return TeaModel.build(map, self);
    }

    public FraudResultCallBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FraudResultCallBackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FraudResultCallBackResponse setBody(FraudResultCallBackResponseBody body) {
        this.body = body;
        return this;
    }
    public FraudResultCallBackResponseBody getBody() {
        return this.body;
    }

}
