// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelUpdateMultiModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelUpdateMultiModelResponseBody body;

    public static SentinelUpdateMultiModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelUpdateMultiModelResponse self = new SentinelUpdateMultiModelResponse();
        return TeaModel.build(map, self);
    }

    public SentinelUpdateMultiModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelUpdateMultiModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelUpdateMultiModelResponse setBody(SentinelUpdateMultiModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelUpdateMultiModelResponseBody getBody() {
        return this.body;
    }

}
