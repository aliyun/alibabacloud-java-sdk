// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DeleteXsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteXsInstanceResponseBody body;

    public static DeleteXsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteXsInstanceResponse self = new DeleteXsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteXsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteXsInstanceResponse setBody(DeleteXsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteXsInstanceResponseBody getBody() {
        return this.body;
    }

}
