// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListServerLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerLockResponseBody body;

    public static ListServerLockResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerLockResponse self = new ListServerLockResponse();
        return TeaModel.build(map, self);
    }

    public ListServerLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerLockResponse setBody(ListServerLockResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerLockResponseBody getBody() {
        return this.body;
    }

}
