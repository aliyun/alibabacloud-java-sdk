// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRankingModelResponseBody body;

    public static DeleteRankingModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingModelResponse self = new DeleteRankingModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRankingModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRankingModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRankingModelResponse setBody(DeleteRankingModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRankingModelResponseBody getBody() {
        return this.body;
    }

}
