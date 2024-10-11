// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListRankingModelTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRankingModelTemplatesResponseBody body;

    public static ListRankingModelTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRankingModelTemplatesResponse self = new ListRankingModelTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListRankingModelTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRankingModelTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRankingModelTemplatesResponse setBody(ListRankingModelTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRankingModelTemplatesResponseBody getBody() {
        return this.body;
    }

}
