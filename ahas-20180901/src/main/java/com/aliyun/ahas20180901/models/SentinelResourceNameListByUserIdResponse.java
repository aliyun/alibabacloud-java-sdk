// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelResourceNameListByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelResourceNameListByUserIdResponseBody body;

    public static SentinelResourceNameListByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelResourceNameListByUserIdResponse self = new SentinelResourceNameListByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public SentinelResourceNameListByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelResourceNameListByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelResourceNameListByUserIdResponse setBody(SentinelResourceNameListByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelResourceNameListByUserIdResponseBody getBody() {
        return this.body;
    }

}
