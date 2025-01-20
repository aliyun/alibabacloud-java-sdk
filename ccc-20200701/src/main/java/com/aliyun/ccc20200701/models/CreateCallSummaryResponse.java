// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCallSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCallSummaryResponseBody body;

    public static CreateCallSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCallSummaryResponse self = new CreateCallSummaryResponse();
        return TeaModel.build(map, self);
    }

    public CreateCallSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCallSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCallSummaryResponse setBody(CreateCallSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCallSummaryResponseBody getBody() {
        return this.body;
    }

}
