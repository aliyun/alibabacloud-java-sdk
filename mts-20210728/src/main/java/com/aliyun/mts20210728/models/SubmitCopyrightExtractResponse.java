// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCopyrightExtractResponseBody body;

    public static SubmitCopyrightExtractResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractResponse self = new SubmitCopyrightExtractResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCopyrightExtractResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCopyrightExtractResponse setBody(SubmitCopyrightExtractResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCopyrightExtractResponseBody getBody() {
        return this.body;
    }

}
