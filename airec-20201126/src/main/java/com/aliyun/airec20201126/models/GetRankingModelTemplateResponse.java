// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class GetRankingModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRankingModelTemplateResponseBody body;

    public static GetRankingModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRankingModelTemplateResponse self = new GetRankingModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetRankingModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRankingModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRankingModelTemplateResponse setBody(GetRankingModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRankingModelTemplateResponseBody getBody() {
        return this.body;
    }

}
