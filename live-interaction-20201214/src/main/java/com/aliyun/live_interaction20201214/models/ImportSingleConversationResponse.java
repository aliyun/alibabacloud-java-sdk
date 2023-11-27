// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportSingleConversationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportSingleConversationResponseBody body;

    public static ImportSingleConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportSingleConversationResponse self = new ImportSingleConversationResponse();
        return TeaModel.build(map, self);
    }

    public ImportSingleConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportSingleConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportSingleConversationResponse setBody(ImportSingleConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportSingleConversationResponseBody getBody() {
        return this.body;
    }

}
