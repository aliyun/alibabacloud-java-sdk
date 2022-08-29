// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ModifyTrustDaPsiPreCacheJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTrustDaPsiPreCacheJobResponseBody body;

    public static ModifyTrustDaPsiPreCacheJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTrustDaPsiPreCacheJobResponse self = new ModifyTrustDaPsiPreCacheJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTrustDaPsiPreCacheJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTrustDaPsiPreCacheJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTrustDaPsiPreCacheJobResponse setBody(ModifyTrustDaPsiPreCacheJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTrustDaPsiPreCacheJobResponseBody getBody() {
        return this.body;
    }

}
