// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSaslUserResponseBody body;

    public static DeleteSaslUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSaslUserResponse self = new DeleteSaslUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSaslUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSaslUserResponse setBody(DeleteSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSaslUserResponseBody getBody() {
        return this.body;
    }

}
