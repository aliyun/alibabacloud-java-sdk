// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchGetOnlineUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetOnlineUsersResponseBody body;

    public static BatchGetOnlineUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetOnlineUsersResponse self = new BatchGetOnlineUsersResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetOnlineUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetOnlineUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetOnlineUsersResponse setBody(BatchGetOnlineUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetOnlineUsersResponseBody getBody() {
        return this.body;
    }

}
