// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelProtectionModuleDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelProtectionModuleDeleteResponseBody body;

    public static SentinelProtectionModuleDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelProtectionModuleDeleteResponse self = new SentinelProtectionModuleDeleteResponse();
        return TeaModel.build(map, self);
    }

    public SentinelProtectionModuleDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelProtectionModuleDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelProtectionModuleDeleteResponse setBody(SentinelProtectionModuleDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelProtectionModuleDeleteResponseBody getBody() {
        return this.body;
    }

}
