// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProductComponentResponseBody body;

    public static UpdateProductComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductComponentResponse self = new UpdateProductComponentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProductComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProductComponentResponse setBody(UpdateProductComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProductComponentResponseBody getBody() {
        return this.body;
    }

}
