// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ConfirmSampleReceivedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmSampleReceivedResponseBody body;

    public static ConfirmSampleReceivedResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSampleReceivedResponse self = new ConfirmSampleReceivedResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmSampleReceivedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmSampleReceivedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmSampleReceivedResponse setBody(ConfirmSampleReceivedResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmSampleReceivedResponseBody getBody() {
        return this.body;
    }

}
