// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcdpMaterialResponseBody body;

    public static CreateMcdpMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpMaterialResponse self = new CreateMcdpMaterialResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcdpMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcdpMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcdpMaterialResponse setBody(CreateMcdpMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcdpMaterialResponseBody getBody() {
        return this.body;
    }

}
