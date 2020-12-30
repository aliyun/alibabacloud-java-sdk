// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourcePoolResponseBody body;

    public static DeleteResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourcePoolResponse self = new DeleteResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourcePoolResponse setBody(DeleteResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourcePoolResponseBody getBody() {
        return this.body;
    }

}
