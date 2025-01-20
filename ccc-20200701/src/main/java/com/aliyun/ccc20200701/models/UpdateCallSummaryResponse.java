// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateCallSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCallSummaryResponseBody body;

    public static UpdateCallSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallSummaryResponse self = new UpdateCallSummaryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCallSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCallSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCallSummaryResponse setBody(UpdateCallSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCallSummaryResponseBody getBody() {
        return this.body;
    }

}
