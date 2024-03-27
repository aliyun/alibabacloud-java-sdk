// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EnableUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableUserResponseBody body;

    public static EnableUserResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableUserResponse self = new EnableUserResponse();
        return TeaModel.build(map, self);
    }

    public EnableUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableUserResponse setBody(EnableUserResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableUserResponseBody getBody() {
        return this.body;
    }

}
