// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductVersionRelatedFoundationVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProductVersionRelatedFoundationVersionResponseBody body;

    public static UpdateProductVersionRelatedFoundationVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionRelatedFoundationVersionResponse self = new UpdateProductVersionRelatedFoundationVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionRelatedFoundationVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductVersionRelatedFoundationVersionResponse setBody(UpdateProductVersionRelatedFoundationVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductVersionRelatedFoundationVersionResponseBody getBody() {
        return this.body;
    }

}
