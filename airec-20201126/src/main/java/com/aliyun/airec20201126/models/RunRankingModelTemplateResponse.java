// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RunRankingModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunRankingModelTemplateResponseBody body;

    public static RunRankingModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        RunRankingModelTemplateResponse self = new RunRankingModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public RunRankingModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunRankingModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunRankingModelTemplateResponse setBody(RunRankingModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public RunRankingModelTemplateResponseBody getBody() {
        return this.body;
    }

}
