// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ManageAICLoginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageAICLoginResponseBody body;

    public static ManageAICLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageAICLoginResponse self = new ManageAICLoginResponse();
        return TeaModel.build(map, self);
    }

    public ManageAICLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageAICLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageAICLoginResponse setBody(ManageAICLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageAICLoginResponseBody getBody() {
        return this.body;
    }

}
