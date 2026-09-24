// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DiduiAreaDeductionProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DiduiAreaDeductionProResponseBody body;

    public static DiduiAreaDeductionProResponse build(java.util.Map<String, ?> map) throws Exception {
        DiduiAreaDeductionProResponse self = new DiduiAreaDeductionProResponse();
        return TeaModel.build(map, self);
    }

    public DiduiAreaDeductionProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DiduiAreaDeductionProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DiduiAreaDeductionProResponse setBody(DiduiAreaDeductionProResponseBody body) {
        this.body = body;
        return this;
    }
    public DiduiAreaDeductionProResponseBody getBody() {
        return this.body;
    }

}
