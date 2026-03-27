// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchTableKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchTableKnowledgeResponseBody body;

    public static SearchTableKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTableKnowledgeResponse self = new SearchTableKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public SearchTableKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTableKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTableKnowledgeResponse setBody(SearchTableKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTableKnowledgeResponseBody getBody() {
        return this.body;
    }

}
