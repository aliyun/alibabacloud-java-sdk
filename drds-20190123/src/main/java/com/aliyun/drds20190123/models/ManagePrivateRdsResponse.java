// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ManagePrivateRdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ManagePrivateRdsResponseBody body;

    public static ManagePrivateRdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ManagePrivateRdsResponse self = new ManagePrivateRdsResponse();
        return TeaModel.build(map, self);
    }

    public ManagePrivateRdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManagePrivateRdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManagePrivateRdsResponse setBody(ManagePrivateRdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ManagePrivateRdsResponseBody getBody() {
        return this.body;
    }

}
