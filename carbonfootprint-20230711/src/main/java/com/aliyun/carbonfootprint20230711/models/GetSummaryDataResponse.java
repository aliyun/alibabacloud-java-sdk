// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.carbonfootprint20230711.models;

import com.aliyun.tea.*;

public class GetSummaryDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSummaryDataResponseBody body;

    public static GetSummaryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryDataResponse self = new GetSummaryDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSummaryDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSummaryDataResponse setBody(GetSummaryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSummaryDataResponseBody getBody() {
        return this.body;
    }

}
