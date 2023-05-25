// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ValidateVpcConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateVpcConnectivityResponseBody body;

    public static ValidateVpcConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateVpcConnectivityResponse self = new ValidateVpcConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public ValidateVpcConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateVpcConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateVpcConnectivityResponse setBody(ValidateVpcConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateVpcConnectivityResponseBody getBody() {
        return this.body;
    }

}
