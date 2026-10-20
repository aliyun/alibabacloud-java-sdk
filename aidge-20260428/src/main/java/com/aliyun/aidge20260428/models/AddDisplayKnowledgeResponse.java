// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AddDisplayKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDisplayKnowledgeResponseBody body;

    public static AddDisplayKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDisplayKnowledgeResponse self = new AddDisplayKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public AddDisplayKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDisplayKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDisplayKnowledgeResponse setBody(AddDisplayKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDisplayKnowledgeResponseBody getBody() {
        return this.body;
    }

}
