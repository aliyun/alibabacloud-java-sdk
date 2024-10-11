// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateRankingModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRankingModelTemplateResponseBody body;

    public static CreateRankingModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRankingModelTemplateResponse self = new CreateRankingModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public CreateRankingModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRankingModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRankingModelTemplateResponse setBody(CreateRankingModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRankingModelTemplateResponseBody getBody() {
        return this.body;
    }

}
