// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class OperateUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateUserResponseBody body;

    public static OperateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateUserResponse self = new OperateUserResponse();
        return TeaModel.build(map, self);
    }

    public OperateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateUserResponse setBody(OperateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateUserResponseBody getBody() {
        return this.body;
    }

}
