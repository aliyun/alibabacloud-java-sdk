// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class UnbindDBResourceGroupWithUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindDBResourceGroupWithUserResponseBody body;

    public static UnbindDBResourceGroupWithUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourceGroupWithUserResponse self = new UnbindDBResourceGroupWithUserResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourceGroupWithUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDBResourceGroupWithUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDBResourceGroupWithUserResponse setBody(UnbindDBResourceGroupWithUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDBResourceGroupWithUserResponseBody getBody() {
        return this.body;
    }

}
