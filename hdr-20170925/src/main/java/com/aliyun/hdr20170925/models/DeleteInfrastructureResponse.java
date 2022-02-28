// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DeleteInfrastructureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInfrastructureResponseBody body;

    public static DeleteInfrastructureResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInfrastructureResponse self = new DeleteInfrastructureResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInfrastructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInfrastructureResponse setBody(DeleteInfrastructureResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInfrastructureResponseBody getBody() {
        return this.body;
    }

}
