// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMacTopNResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelMacTopNResourcesResponseBody body;

    public static SentinelMacTopNResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelMacTopNResourcesResponse self = new SentinelMacTopNResourcesResponse();
        return TeaModel.build(map, self);
    }

    public SentinelMacTopNResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelMacTopNResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelMacTopNResourcesResponse setBody(SentinelMacTopNResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelMacTopNResourcesResponseBody getBody() {
        return this.body;
    }

}
