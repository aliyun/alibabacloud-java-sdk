// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddZooKeeperSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddZooKeeperSaslUserResponseBody body;

    public static AddZooKeeperSaslUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddZooKeeperSaslUserResponse self = new AddZooKeeperSaslUserResponse();
        return TeaModel.build(map, self);
    }

    public AddZooKeeperSaslUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddZooKeeperSaslUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddZooKeeperSaslUserResponse setBody(AddZooKeeperSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddZooKeeperSaslUserResponseBody getBody() {
        return this.body;
    }

}
