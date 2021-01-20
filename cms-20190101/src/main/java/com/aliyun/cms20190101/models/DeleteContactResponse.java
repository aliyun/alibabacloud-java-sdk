// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteContactResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContactResponseBody body;

    public static DeleteContactResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactResponse self = new DeleteContactResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactResponse setBody(DeleteContactResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactResponseBody getBody() {
        return this.body;
    }

}
