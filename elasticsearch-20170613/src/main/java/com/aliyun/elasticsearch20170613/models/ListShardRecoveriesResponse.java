// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListShardRecoveriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShardRecoveriesResponseBody body;

    public static ListShardRecoveriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShardRecoveriesResponse self = new ListShardRecoveriesResponse();
        return TeaModel.build(map, self);
    }

    public ListShardRecoveriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShardRecoveriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShardRecoveriesResponse setBody(ListShardRecoveriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShardRecoveriesResponseBody getBody() {
        return this.body;
    }

}
