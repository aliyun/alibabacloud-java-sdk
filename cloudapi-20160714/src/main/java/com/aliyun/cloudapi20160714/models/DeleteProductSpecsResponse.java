// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteProductSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductSpecsResponseBody body;

    public static DeleteProductSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductSpecsResponse self = new DeleteProductSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductSpecsResponse setBody(DeleteProductSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductSpecsResponseBody getBody() {
        return this.body;
    }

}
