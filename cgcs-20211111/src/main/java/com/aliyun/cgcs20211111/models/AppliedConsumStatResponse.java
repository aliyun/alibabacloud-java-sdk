// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedConsumStatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AppliedConsumStatResponseBody body;

    public static AppliedConsumStatResponse build(java.util.Map<String, ?> map) throws Exception {
        AppliedConsumStatResponse self = new AppliedConsumStatResponse();
        return TeaModel.build(map, self);
    }

    public AppliedConsumStatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppliedConsumStatResponse setBody(AppliedConsumStatResponseBody body) {
        this.body = body;
        return this;
    }
    public AppliedConsumStatResponseBody getBody() {
        return this.body;
    }

}
