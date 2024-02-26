// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteSaslUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSaslUserResponse setBody(DeleteSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSaslUserResponseBody getBody() {
        return this.body;
    }

}
