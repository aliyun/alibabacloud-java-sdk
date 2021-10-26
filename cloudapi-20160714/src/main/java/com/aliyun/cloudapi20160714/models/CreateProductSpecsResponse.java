// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateProductSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProductSpecsResponseBody body;

    public static CreateProductSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProductSpecsResponse self = new CreateProductSpecsResponse();
        return TeaModel.build(map, self);
    }

    public CreateProductSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProductSpecsResponse setBody(CreateProductSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProductSpecsResponseBody getBody() {
        return this.body;
    }

}
