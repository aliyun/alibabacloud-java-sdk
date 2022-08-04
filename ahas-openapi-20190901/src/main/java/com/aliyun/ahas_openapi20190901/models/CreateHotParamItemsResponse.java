// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateHotParamItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHotParamItemsResponseBody body;

    public static CreateHotParamItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHotParamItemsResponse self = new CreateHotParamItemsResponse();
        return TeaModel.build(map, self);
    }

    public CreateHotParamItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHotParamItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHotParamItemsResponse setBody(CreateHotParamItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHotParamItemsResponseBody getBody() {
        return this.body;
    }

}
