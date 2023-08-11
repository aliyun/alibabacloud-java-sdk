// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class ConfirmSampleShippedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmSampleShippedResponseBody body;

    public static ConfirmSampleShippedResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSampleShippedResponse self = new ConfirmSampleShippedResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmSampleShippedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmSampleShippedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmSampleShippedResponse setBody(ConfirmSampleShippedResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmSampleShippedResponseBody getBody() {
        return this.body;
    }

}
