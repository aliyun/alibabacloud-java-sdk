// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SyncUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncUsersResponseBody body;

    public static SyncUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncUsersResponse self = new SyncUsersResponse();
        return TeaModel.build(map, self);
    }

    public SyncUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncUsersResponse setBody(SyncUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncUsersResponseBody getBody() {
        return this.body;
    }

}
