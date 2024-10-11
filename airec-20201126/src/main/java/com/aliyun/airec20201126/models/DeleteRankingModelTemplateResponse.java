// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingModelTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRankingModelTemplateResponseBody body;

    public static DeleteRankingModelTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingModelTemplateResponse self = new DeleteRankingModelTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRankingModelTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRankingModelTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRankingModelTemplateResponse setBody(DeleteRankingModelTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRankingModelTemplateResponseBody getBody() {
        return this.body;
    }

}
