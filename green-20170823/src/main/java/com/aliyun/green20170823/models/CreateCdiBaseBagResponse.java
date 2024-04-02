// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateCdiBaseBagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCdiBaseBagResponseBody body;

    public static CreateCdiBaseBagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdiBaseBagResponse self = new CreateCdiBaseBagResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdiBaseBagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdiBaseBagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCdiBaseBagResponse setBody(CreateCdiBaseBagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdiBaseBagResponseBody getBody() {
        return this.body;
    }

}
