// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DeleteDBCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBCollectionResponseBody body;

    public static DeleteDBCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBCollectionResponse self = new DeleteDBCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBCollectionResponse setBody(DeleteDBCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBCollectionResponseBody getBody() {
        return this.body;
    }

}
