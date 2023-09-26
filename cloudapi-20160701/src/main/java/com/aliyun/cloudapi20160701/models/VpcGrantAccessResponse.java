// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class VpcGrantAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VpcGrantAccessResponseBody body;

    public static VpcGrantAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        VpcGrantAccessResponse self = new VpcGrantAccessResponse();
        return TeaModel.build(map, self);
    }

    public VpcGrantAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VpcGrantAccessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VpcGrantAccessResponse setBody(VpcGrantAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public VpcGrantAccessResponseBody getBody() {
        return this.body;
    }

}
