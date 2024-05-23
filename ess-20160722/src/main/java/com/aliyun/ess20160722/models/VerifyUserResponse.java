// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class VerifyUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    public static VerifyUserResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyUserResponse self = new VerifyUserResponse();
        return TeaModel.build(map, self);
    }

    public VerifyUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

}
