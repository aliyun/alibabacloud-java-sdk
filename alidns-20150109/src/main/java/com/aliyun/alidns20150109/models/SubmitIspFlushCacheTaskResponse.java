// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SubmitIspFlushCacheTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIspFlushCacheTaskResponseBody body;

    public static SubmitIspFlushCacheTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIspFlushCacheTaskResponse self = new SubmitIspFlushCacheTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIspFlushCacheTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIspFlushCacheTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIspFlushCacheTaskResponse setBody(SubmitIspFlushCacheTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIspFlushCacheTaskResponseBody getBody() {
        return this.body;
    }

}
