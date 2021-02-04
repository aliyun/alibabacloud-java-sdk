// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMaterialResponseBody body;

    public static CreateMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaterialResponse self = new CreateMaterialResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaterialResponse setBody(CreateMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaterialResponseBody getBody() {
        return this.body;
    }

}
