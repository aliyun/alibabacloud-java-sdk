// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RetryDataCorrectPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryDataCorrectPreCheckResponseBody body;

    public static RetryDataCorrectPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryDataCorrectPreCheckResponse self = new RetryDataCorrectPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public RetryDataCorrectPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryDataCorrectPreCheckResponse setBody(RetryDataCorrectPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryDataCorrectPreCheckResponseBody getBody() {
        return this.body;
    }

}
