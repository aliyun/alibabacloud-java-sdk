// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgePointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgePointsResponseBody body;

    public static ListKnowledgePointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgePointsResponse self = new ListKnowledgePointsResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgePointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgePointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgePointsResponse setBody(ListKnowledgePointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgePointsResponseBody getBody() {
        return this.body;
    }

}
