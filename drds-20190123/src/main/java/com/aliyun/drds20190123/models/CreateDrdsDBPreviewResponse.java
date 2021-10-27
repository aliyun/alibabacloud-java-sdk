// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBPreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDrdsDBPreviewResponseBody body;

    public static CreateDrdsDBPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBPreviewResponse self = new CreateDrdsDBPreviewResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrdsDBPreviewResponse setBody(CreateDrdsDBPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrdsDBPreviewResponseBody getBody() {
        return this.body;
    }

}
