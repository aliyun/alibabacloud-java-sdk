// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteSpaceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSpaceModelResponseBody body;

    public static DeleteSpaceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpaceModelResponse self = new DeleteSpaceModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpaceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpaceModelResponse setBody(DeleteSpaceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpaceModelResponseBody getBody() {
        return this.body;
    }

}
