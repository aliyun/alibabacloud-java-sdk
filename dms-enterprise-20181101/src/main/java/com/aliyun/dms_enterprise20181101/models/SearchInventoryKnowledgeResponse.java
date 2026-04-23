// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchInventoryKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchInventoryKnowledgeResponseBody body;

    public static SearchInventoryKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryKnowledgeResponse self = new SearchInventoryKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public SearchInventoryKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchInventoryKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchInventoryKnowledgeResponse setBody(SearchInventoryKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchInventoryKnowledgeResponseBody getBody() {
        return this.body;
    }

}
