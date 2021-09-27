// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductInstanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductInstanceConfigResponseBody body;

    public static DeleteProductInstanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductInstanceConfigResponse self = new DeleteProductInstanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductInstanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductInstanceConfigResponse setBody(DeleteProductInstanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductInstanceConfigResponseBody getBody() {
        return this.body;
    }

}
