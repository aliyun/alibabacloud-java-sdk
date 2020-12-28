// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class DeleteVirtualHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVirtualHostResponseBody body;

    public static DeleteVirtualHostResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualHostResponse self = new DeleteVirtualHostResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualHostResponse setBody(DeleteVirtualHostResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualHostResponseBody getBody() {
        return this.body;
    }

}
