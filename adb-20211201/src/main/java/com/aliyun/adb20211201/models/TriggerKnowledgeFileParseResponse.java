// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class TriggerKnowledgeFileParseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerKnowledgeFileParseResponseBody body;

    public static TriggerKnowledgeFileParseResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerKnowledgeFileParseResponse self = new TriggerKnowledgeFileParseResponse();
        return TeaModel.build(map, self);
    }

    public TriggerKnowledgeFileParseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerKnowledgeFileParseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerKnowledgeFileParseResponse setBody(TriggerKnowledgeFileParseResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerKnowledgeFileParseResponseBody getBody() {
        return this.body;
    }

}
