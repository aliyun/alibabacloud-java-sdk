// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelCreateMultiModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelCreateMultiModelResponseBody body;

    public static SentinelCreateMultiModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelCreateMultiModelResponse self = new SentinelCreateMultiModelResponse();
        return TeaModel.build(map, self);
    }

    public SentinelCreateMultiModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelCreateMultiModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelCreateMultiModelResponse setBody(SentinelCreateMultiModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelCreateMultiModelResponseBody getBody() {
        return this.body;
    }

}
