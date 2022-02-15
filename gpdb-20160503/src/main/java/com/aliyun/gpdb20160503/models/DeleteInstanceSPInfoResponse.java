// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteInstanceSPInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceSPInfoResponseBody body;

    public static DeleteInstanceSPInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSPInfoResponse self = new DeleteInstanceSPInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSPInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceSPInfoResponse setBody(DeleteInstanceSPInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceSPInfoResponseBody getBody() {
        return this.body;
    }

}
