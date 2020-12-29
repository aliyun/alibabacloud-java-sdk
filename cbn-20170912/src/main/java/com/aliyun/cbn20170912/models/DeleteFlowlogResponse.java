// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteFlowlogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFlowlogResponseBody body;

    public static DeleteFlowlogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowlogResponse self = new DeleteFlowlogResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlowlogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlowlogResponse setBody(DeleteFlowlogResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlowlogResponseBody getBody() {
        return this.body;
    }

}
