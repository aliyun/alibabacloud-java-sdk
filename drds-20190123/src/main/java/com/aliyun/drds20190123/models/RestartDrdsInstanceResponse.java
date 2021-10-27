// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RestartDrdsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestartDrdsInstanceResponseBody body;

    public static RestartDrdsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartDrdsInstanceResponse self = new RestartDrdsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RestartDrdsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartDrdsInstanceResponse setBody(RestartDrdsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartDrdsInstanceResponseBody getBody() {
        return this.body;
    }

}
