// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceResponseBody body;

    public static DeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceResponse self = new DeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceResponse setBody(DeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceResponseBody getBody() {
        return this.body;
    }

}
