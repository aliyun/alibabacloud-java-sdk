// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ReinstateAuthenticationTokenByConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static ReinstateAuthenticationTokenByConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinstateAuthenticationTokenByConsumerResponse self = new ReinstateAuthenticationTokenByConsumerResponse();
        return TeaModel.build(map, self);
    }

    public ReinstateAuthenticationTokenByConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinstateAuthenticationTokenByConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
