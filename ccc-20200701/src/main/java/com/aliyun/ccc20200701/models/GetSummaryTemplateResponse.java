// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSummaryTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSummaryTemplateResponseBody body;

    public static GetSummaryTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryTemplateResponse self = new GetSummaryTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetSummaryTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSummaryTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSummaryTemplateResponse setBody(GetSummaryTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSummaryTemplateResponseBody getBody() {
        return this.body;
    }

}
