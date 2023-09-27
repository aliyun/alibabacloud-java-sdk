// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class SdkGenerateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SdkGenerateResponseBody body;

    public static SdkGenerateResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateResponse self = new SdkGenerateResponse();
        return TeaModel.build(map, self);
    }

    public SdkGenerateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkGenerateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkGenerateResponse setBody(SdkGenerateResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkGenerateResponseBody getBody() {
        return this.body;
    }

}
