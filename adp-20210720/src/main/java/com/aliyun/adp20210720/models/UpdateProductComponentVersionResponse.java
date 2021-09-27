// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProductComponentVersionResponseBody body;

    public static UpdateProductComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentVersionResponse self = new UpdateProductComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductComponentVersionResponse setBody(UpdateProductComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductComponentVersionResponseBody getBody() {
        return this.body;
    }

}
