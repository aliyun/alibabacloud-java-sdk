// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapUnbindSingleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterAssignMapUnbindSingleResponseBody body;

    public static SentinelClusterAssignMapUnbindSingleResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapUnbindSingleResponse self = new SentinelClusterAssignMapUnbindSingleResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapUnbindSingleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterAssignMapUnbindSingleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterAssignMapUnbindSingleResponse setBody(SentinelClusterAssignMapUnbindSingleResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterAssignMapUnbindSingleResponseBody getBody() {
        return this.body;
    }

}
