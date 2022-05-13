// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateVGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVGroupResponseBody body;

    public static CreateVGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVGroupResponse self = new CreateVGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateVGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVGroupResponse setBody(CreateVGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVGroupResponseBody getBody() {
        return this.body;
    }

}
