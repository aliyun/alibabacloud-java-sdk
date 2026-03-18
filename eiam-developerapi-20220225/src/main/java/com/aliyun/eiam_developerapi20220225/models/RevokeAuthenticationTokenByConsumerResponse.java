// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RevokeAuthenticationTokenByConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static RevokeAuthenticationTokenByConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeAuthenticationTokenByConsumerResponse self = new RevokeAuthenticationTokenByConsumerResponse();
        return TeaModel.build(map, self);
    }

    public RevokeAuthenticationTokenByConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeAuthenticationTokenByConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
