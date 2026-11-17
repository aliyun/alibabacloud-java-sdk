// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgePointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetrieveKnowledgePointsResponseBody body;

    public static RetrieveKnowledgePointsResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgePointsResponse self = new RetrieveKnowledgePointsResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgePointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveKnowledgePointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveKnowledgePointsResponse setBody(RetrieveKnowledgePointsResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveKnowledgePointsResponseBody getBody() {
        return this.body;
    }

}
