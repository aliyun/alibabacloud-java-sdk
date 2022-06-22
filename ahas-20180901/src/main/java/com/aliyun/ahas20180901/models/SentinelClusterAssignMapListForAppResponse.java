// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterAssignMapListForAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelClusterAssignMapListForAppResponseBody body;

    public static SentinelClusterAssignMapListForAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterAssignMapListForAppResponse self = new SentinelClusterAssignMapListForAppResponse();
        return TeaModel.build(map, self);
    }

    public SentinelClusterAssignMapListForAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelClusterAssignMapListForAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelClusterAssignMapListForAppResponse setBody(SentinelClusterAssignMapListForAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelClusterAssignMapListForAppResponseBody getBody() {
        return this.body;
    }

}
