// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelGetClusterClientDetailListForAssignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelGetClusterClientDetailListForAssignResponseBody body;

    public static SentinelGetClusterClientDetailListForAssignResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelGetClusterClientDetailListForAssignResponse self = new SentinelGetClusterClientDetailListForAssignResponse();
        return TeaModel.build(map, self);
    }

    public SentinelGetClusterClientDetailListForAssignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelGetClusterClientDetailListForAssignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelGetClusterClientDetailListForAssignResponse setBody(SentinelGetClusterClientDetailListForAssignResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelGetClusterClientDetailListForAssignResponseBody getBody() {
        return this.body;
    }

}
