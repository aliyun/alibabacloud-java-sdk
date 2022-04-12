// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalAppliedNearRealStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TotalAppliedNearRealStatResponseBody body;

    public static TotalAppliedNearRealStatResponse build(java.util.Map<String, ?> map) throws Exception {
        TotalAppliedNearRealStatResponse self = new TotalAppliedNearRealStatResponse();
        return TeaModel.build(map, self);
    }

    public TotalAppliedNearRealStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TotalAppliedNearRealStatResponse setBody(TotalAppliedNearRealStatResponseBody body) {
        this.body = body;
        return this;
    }
    public TotalAppliedNearRealStatResponseBody getBody() {
        return this.body;
    }

}
