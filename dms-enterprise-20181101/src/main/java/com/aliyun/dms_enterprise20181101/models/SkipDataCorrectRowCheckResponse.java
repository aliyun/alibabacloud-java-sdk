// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SkipDataCorrectRowCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SkipDataCorrectRowCheckResponseBody body;

    public static SkipDataCorrectRowCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipDataCorrectRowCheckResponse self = new SkipDataCorrectRowCheckResponse();
        return TeaModel.build(map, self);
    }

    public SkipDataCorrectRowCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipDataCorrectRowCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipDataCorrectRowCheckResponse setBody(SkipDataCorrectRowCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipDataCorrectRowCheckResponseBody getBody() {
        return this.body;
    }

}
