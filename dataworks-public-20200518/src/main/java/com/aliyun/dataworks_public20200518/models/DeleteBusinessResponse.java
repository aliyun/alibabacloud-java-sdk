// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBusinessResponseBody body;

    public static DeleteBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessResponse self = new DeleteBusinessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBusinessResponse setBody(DeleteBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessResponseBody getBody() {
        return this.body;
    }

}
