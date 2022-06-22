// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSentinelClientVersionOfAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetSentinelClientVersionOfAppResponseBody body;

    public static GetSentinelClientVersionOfAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelClientVersionOfAppResponse self = new GetSentinelClientVersionOfAppResponse();
        return TeaModel.build(map, self);
    }

    public GetSentinelClientVersionOfAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSentinelClientVersionOfAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSentinelClientVersionOfAppResponse setBody(GetSentinelClientVersionOfAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSentinelClientVersionOfAppResponseBody getBody() {
        return this.body;
    }

}
