// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDeleteMultiModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelDeleteMultiModelResponseBody body;

    public static SentinelDeleteMultiModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelDeleteMultiModelResponse self = new SentinelDeleteMultiModelResponse();
        return TeaModel.build(map, self);
    }

    public SentinelDeleteMultiModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelDeleteMultiModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelDeleteMultiModelResponse setBody(SentinelDeleteMultiModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelDeleteMultiModelResponseBody getBody() {
        return this.body;
    }

}
