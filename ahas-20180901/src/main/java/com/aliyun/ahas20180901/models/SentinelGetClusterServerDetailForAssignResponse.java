// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetClusterServerDetailForAssignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetClusterServerDetailForAssignResponseBody body;

    public static SentinelGetClusterServerDetailForAssignResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetClusterServerDetailForAssignResponse self = new SentinelGetClusterServerDetailForAssignResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetClusterServerDetailForAssignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetClusterServerDetailForAssignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetClusterServerDetailForAssignResponse setBody(SentinelGetClusterServerDetailForAssignResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetClusterServerDetailForAssignResponseBody getBody() {
        return this.body;
    }

}
