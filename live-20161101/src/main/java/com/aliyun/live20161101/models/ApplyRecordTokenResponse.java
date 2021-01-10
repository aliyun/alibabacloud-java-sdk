// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ApplyRecordTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyRecordTokenResponseBody body;

    public static ApplyRecordTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyRecordTokenResponse self = new ApplyRecordTokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyRecordTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyRecordTokenResponse setBody(ApplyRecordTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyRecordTokenResponseBody getBody() {
        return this.body;
    }

}
