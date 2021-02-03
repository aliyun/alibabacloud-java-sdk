// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMediaInfosResponseBody body;

    public static DeleteMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaInfosResponse self = new DeleteMediaInfosResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMediaInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMediaInfosResponse setBody(DeleteMediaInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMediaInfosResponseBody getBody() {
        return this.body;
    }

}
