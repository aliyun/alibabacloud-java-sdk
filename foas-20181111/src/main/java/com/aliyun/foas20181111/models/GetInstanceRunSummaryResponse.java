// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceRunSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceRunSummaryResponseBody body;

    public static GetInstanceRunSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRunSummaryResponse self = new GetInstanceRunSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceRunSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceRunSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceRunSummaryResponse setBody(GetInstanceRunSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceRunSummaryResponseBody getBody() {
        return this.body;
    }

}
