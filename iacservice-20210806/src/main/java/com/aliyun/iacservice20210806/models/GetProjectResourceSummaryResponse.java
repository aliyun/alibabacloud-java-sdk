// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectResourceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectResourceSummaryResponseBody body;

    public static GetProjectResourceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResourceSummaryResponse self = new GetProjectResourceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectResourceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectResourceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectResourceSummaryResponse setBody(GetProjectResourceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectResourceSummaryResponseBody getBody() {
        return this.body;
    }

}
