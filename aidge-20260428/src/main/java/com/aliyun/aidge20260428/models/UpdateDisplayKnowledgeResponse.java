// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class UpdateDisplayKnowledgeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDisplayKnowledgeResponseBody body;

    public static UpdateDisplayKnowledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDisplayKnowledgeResponse self = new UpdateDisplayKnowledgeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDisplayKnowledgeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDisplayKnowledgeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDisplayKnowledgeResponse setBody(UpdateDisplayKnowledgeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDisplayKnowledgeResponseBody getBody() {
        return this.body;
    }

}
