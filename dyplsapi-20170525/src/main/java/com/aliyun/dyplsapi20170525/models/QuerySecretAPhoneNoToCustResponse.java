// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretAPhoneNoToCustResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySecretAPhoneNoToCustResponseBody body;

    public static QuerySecretAPhoneNoToCustResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretAPhoneNoToCustResponse self = new QuerySecretAPhoneNoToCustResponse();
        return TeaModel.build(map, self);
    }

    public QuerySecretAPhoneNoToCustResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySecretAPhoneNoToCustResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySecretAPhoneNoToCustResponse setBody(QuerySecretAPhoneNoToCustResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySecretAPhoneNoToCustResponseBody getBody() {
        return this.body;
    }

}
