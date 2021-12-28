// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteIpResponseBody body;

    public static DeleteIpResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpResponse self = new DeleteIpResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpResponse setBody(DeleteIpResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpResponseBody getBody() {
        return this.body;
    }

}
