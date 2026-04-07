// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RemoveZooKeeperSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveZooKeeperSaslUserResponseBody body;

    public static RemoveZooKeeperSaslUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveZooKeeperSaslUserResponse self = new RemoveZooKeeperSaslUserResponse();
        return TeaModel.build(map, self);
    }

    public RemoveZooKeeperSaslUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveZooKeeperSaslUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveZooKeeperSaslUserResponse setBody(RemoveZooKeeperSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveZooKeeperSaslUserResponseBody getBody() {
        return this.body;
    }

}
