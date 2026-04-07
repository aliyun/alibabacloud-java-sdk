// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateZooKeeperSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateZooKeeperSaslUserResponseBody body;

    public static UpdateZooKeeperSaslUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateZooKeeperSaslUserResponse self = new UpdateZooKeeperSaslUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateZooKeeperSaslUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateZooKeeperSaslUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateZooKeeperSaslUserResponse setBody(UpdateZooKeeperSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateZooKeeperSaslUserResponseBody getBody() {
        return this.body;
    }

}
