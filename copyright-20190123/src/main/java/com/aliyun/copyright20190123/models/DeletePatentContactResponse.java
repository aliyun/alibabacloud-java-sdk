// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePatentContactResponseBody body;

    public static DeletePatentContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentContactResponse self = new DeletePatentContactResponse();
        return TeaModel.build(map, self);
    }

    public DeletePatentContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePatentContactResponse setBody(DeletePatentContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePatentContactResponseBody getBody() {
        return this.body;
    }

}
