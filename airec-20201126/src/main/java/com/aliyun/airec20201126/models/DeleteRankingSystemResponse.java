// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DeleteRankingSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRankingSystemResponseBody body;

    public static DeleteRankingSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRankingSystemResponse self = new DeleteRankingSystemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRankingSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRankingSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRankingSystemResponse setBody(DeleteRankingSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRankingSystemResponseBody getBody() {
        return this.body;
    }

}
