// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelResourcesPercentageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelResourcesPercentageResponseBody body;

    public static SentinelResourcesPercentageResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelResourcesPercentageResponse self = new SentinelResourcesPercentageResponse();
        return TeaModel.build(map, self);
    }

    public SentinelResourcesPercentageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelResourcesPercentageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelResourcesPercentageResponse setBody(SentinelResourcesPercentageResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelResourcesPercentageResponseBody getBody() {
        return this.body;
    }

}
