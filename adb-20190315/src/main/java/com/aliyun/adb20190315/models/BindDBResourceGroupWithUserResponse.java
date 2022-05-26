// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BindDBResourceGroupWithUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindDBResourceGroupWithUserResponseBody body;

    public static BindDBResourceGroupWithUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourceGroupWithUserResponse self = new BindDBResourceGroupWithUserResponse();
        return TeaModel.build(map, self);
    }

    public BindDBResourceGroupWithUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDBResourceGroupWithUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindDBResourceGroupWithUserResponse setBody(BindDBResourceGroupWithUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDBResourceGroupWithUserResponseBody getBody() {
        return this.body;
    }

}
