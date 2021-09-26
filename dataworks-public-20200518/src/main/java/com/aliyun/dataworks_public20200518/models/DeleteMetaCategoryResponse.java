// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteMetaCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMetaCategoryResponseBody body;

    public static DeleteMetaCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetaCategoryResponse self = new DeleteMetaCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetaCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetaCategoryResponse setBody(DeleteMetaCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetaCategoryResponseBody getBody() {
        return this.body;
    }

}
