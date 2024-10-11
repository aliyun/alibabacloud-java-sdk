// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRankingModelVersionResponseBody body;

    public static DeleteRankingModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingModelVersionResponse self = new DeleteRankingModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRankingModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRankingModelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRankingModelVersionResponse setBody(DeleteRankingModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRankingModelVersionResponseBody getBody() {
        return this.body;
    }

}
