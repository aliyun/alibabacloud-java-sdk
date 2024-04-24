// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupDrdsParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetupDrdsParamsResponseBody body;

    public static SetupDrdsParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        SetupDrdsParamsResponse self = new SetupDrdsParamsResponse();
        return TeaModel.build(map, self);
    }

    public SetupDrdsParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetupDrdsParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetupDrdsParamsResponse setBody(SetupDrdsParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupDrdsParamsResponseBody getBody() {
        return this.body;
    }

}
