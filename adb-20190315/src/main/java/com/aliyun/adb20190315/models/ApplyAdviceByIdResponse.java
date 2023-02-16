// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ApplyAdviceByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyAdviceByIdResponseBody body;

    public static ApplyAdviceByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAdviceByIdResponse self = new ApplyAdviceByIdResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAdviceByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAdviceByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAdviceByIdResponse setBody(ApplyAdviceByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAdviceByIdResponseBody getBody() {
        return this.body;
    }

}
