// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupDrdsParamsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetupDrdsParamsResponse setBody(SetupDrdsParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public SetupDrdsParamsResponseBody getBody() {
        return this.body;
    }

}
