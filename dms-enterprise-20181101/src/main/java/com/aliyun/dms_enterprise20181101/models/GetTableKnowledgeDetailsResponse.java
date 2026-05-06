// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableKnowledgeDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableKnowledgeDetailsResponseBody body;

    public static GetTableKnowledgeDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableKnowledgeDetailsResponse self = new GetTableKnowledgeDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableKnowledgeDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableKnowledgeDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableKnowledgeDetailsResponse setBody(GetTableKnowledgeDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableKnowledgeDetailsResponseBody getBody() {
        return this.body;
    }

}
