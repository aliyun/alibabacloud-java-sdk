// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyEnvironmentResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyEnvironmentResourceResponseBody body;

    public static ApplyEnvironmentResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyEnvironmentResourceResponse self = new ApplyEnvironmentResourceResponse();
        return TeaModel.build(map, self);
    }

    public ApplyEnvironmentResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyEnvironmentResourceResponse setBody(ApplyEnvironmentResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyEnvironmentResourceResponseBody getBody() {
        return this.body;
    }

}
