// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleNewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelProtectionModuleNewResponseBody body;

    public static SentinelProtectionModuleNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleNewResponse self = new SentinelProtectionModuleNewResponse();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelProtectionModuleNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelProtectionModuleNewResponse setBody(SentinelProtectionModuleNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelProtectionModuleNewResponseBody getBody() {
        return this.body;
    }

}
