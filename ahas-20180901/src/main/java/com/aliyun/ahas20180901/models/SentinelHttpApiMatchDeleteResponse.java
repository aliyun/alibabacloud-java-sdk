// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHttpApiMatchDeleteResponseBody body;

    public static SentinelHttpApiMatchDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchDeleteResponse self = new SentinelHttpApiMatchDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHttpApiMatchDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHttpApiMatchDeleteResponse setBody(SentinelHttpApiMatchDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHttpApiMatchDeleteResponseBody getBody() {
        return this.body;
    }

}
