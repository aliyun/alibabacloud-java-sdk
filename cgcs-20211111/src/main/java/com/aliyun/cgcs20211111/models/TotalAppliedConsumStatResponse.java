// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalAppliedConsumStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TotalAppliedConsumStatResponseBody body;

    public static TotalAppliedConsumStatResponse build(java.util.Map<String, ?> map) throws Exception {
        TotalAppliedConsumStatResponse self = new TotalAppliedConsumStatResponse();
        return TeaModel.build(map, self);
    }

    public TotalAppliedConsumStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TotalAppliedConsumStatResponse setBody(TotalAppliedConsumStatResponseBody body) {
        this.body = body;
        return this;
    }
    public TotalAppliedConsumStatResponseBody getBody() {
        return this.body;
    }

}
