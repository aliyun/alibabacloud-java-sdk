// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRankingModelsResponseBody body;

    public static ListRankingModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelsResponse self = new ListRankingModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListRankingModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRankingModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRankingModelsResponse setBody(ListRankingModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRankingModelsResponseBody getBody() {
        return this.body;
    }

}
