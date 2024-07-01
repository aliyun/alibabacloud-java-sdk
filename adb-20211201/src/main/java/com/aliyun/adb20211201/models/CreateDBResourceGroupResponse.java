// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBResourceGroupResponseBody body;

    public static CreateDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourceGroupResponse self = new CreateDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBResourceGroupResponse setBody(CreateDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}
