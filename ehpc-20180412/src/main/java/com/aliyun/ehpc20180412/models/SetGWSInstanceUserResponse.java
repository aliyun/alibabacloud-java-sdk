// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetGWSInstanceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetGWSInstanceUserResponseBody body;

    public static SetGWSInstanceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SetGWSInstanceUserResponse self = new SetGWSInstanceUserResponse();
        return TeaModel.build(map, self);
    }

    public SetGWSInstanceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetGWSInstanceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetGWSInstanceUserResponse setBody(SetGWSInstanceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SetGWSInstanceUserResponseBody getBody() {
        return this.body;
    }

}
