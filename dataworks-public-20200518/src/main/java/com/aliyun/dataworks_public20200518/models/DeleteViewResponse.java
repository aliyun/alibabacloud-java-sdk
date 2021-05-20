// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteViewResponseBody body;

    public static DeleteViewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteViewResponse self = new DeleteViewResponse();
        return TeaModel.build(map, self);
    }

    public DeleteViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteViewResponse setBody(DeleteViewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteViewResponseBody getBody() {
        return this.body;
    }

}
