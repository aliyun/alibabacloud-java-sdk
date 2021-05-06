// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DeleteDBResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBResourcePoolResponseBody body;

    public static DeleteDBResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBResourcePoolResponse self = new DeleteDBResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBResourcePoolResponse setBody(DeleteDBResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBResourcePoolResponseBody getBody() {
        return this.body;
    }

}
