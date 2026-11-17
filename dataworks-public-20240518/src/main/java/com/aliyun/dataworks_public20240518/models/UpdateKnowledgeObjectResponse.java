// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateKnowledgeObjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKnowledgeObjectResponseBody body;

    public static UpdateKnowledgeObjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKnowledgeObjectResponse self = new UpdateKnowledgeObjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKnowledgeObjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKnowledgeObjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKnowledgeObjectResponse setBody(UpdateKnowledgeObjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKnowledgeObjectResponseBody getBody() {
        return this.body;
    }

}
