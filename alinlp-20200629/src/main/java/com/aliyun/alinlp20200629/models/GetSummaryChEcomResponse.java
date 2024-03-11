// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSummaryChEcomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSummaryChEcomResponseBody body;

    public static GetSummaryChEcomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryChEcomResponse self = new GetSummaryChEcomResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryChEcomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSummaryChEcomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSummaryChEcomResponse setBody(GetSummaryChEcomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSummaryChEcomResponseBody getBody() {
        return this.body;
    }

}
