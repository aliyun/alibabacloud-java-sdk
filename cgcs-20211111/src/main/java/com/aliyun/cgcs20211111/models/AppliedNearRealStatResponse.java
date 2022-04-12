// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedNearRealStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppliedNearRealStatResponseBody body;

    public static AppliedNearRealStatResponse build(java.util.Map<String, ?> map) throws Exception {
        AppliedNearRealStatResponse self = new AppliedNearRealStatResponse();
        return TeaModel.build(map, self);
    }

    public AppliedNearRealStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppliedNearRealStatResponse setBody(AppliedNearRealStatResponseBody body) {
        this.body = body;
        return this;
    }
    public AppliedNearRealStatResponseBody getBody() {
        return this.body;
    }

}
