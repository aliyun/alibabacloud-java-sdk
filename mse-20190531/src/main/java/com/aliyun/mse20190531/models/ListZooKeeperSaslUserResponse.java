// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZooKeeperSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListZooKeeperSaslUserResponseBody body;

    public static ListZooKeeperSaslUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListZooKeeperSaslUserResponse self = new ListZooKeeperSaslUserResponse();
        return TeaModel.build(map, self);
    }

    public ListZooKeeperSaslUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListZooKeeperSaslUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListZooKeeperSaslUserResponse setBody(ListZooKeeperSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListZooKeeperSaslUserResponseBody getBody() {
        return this.body;
    }

}
