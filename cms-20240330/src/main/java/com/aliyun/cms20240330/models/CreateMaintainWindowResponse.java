// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateMaintainWindowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMaintainWindowResponseBody body;

    public static CreateMaintainWindowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaintainWindowResponse self = new CreateMaintainWindowResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaintainWindowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaintainWindowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMaintainWindowResponse setBody(CreateMaintainWindowResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaintainWindowResponseBody getBody() {
        return this.body;
    }

}
