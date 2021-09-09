// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCollectorResponseBody body;

    public static DeleteCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectorResponse self = new DeleteCollectorResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCollectorResponse setBody(DeleteCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCollectorResponseBody getBody() {
        return this.body;
    }

}
