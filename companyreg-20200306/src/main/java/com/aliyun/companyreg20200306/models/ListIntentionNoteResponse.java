// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListIntentionNoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListIntentionNoteResponseBody body;

    public static ListIntentionNoteResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntentionNoteResponse self = new ListIntentionNoteResponse();
        return TeaModel.build(map, self);
    }

    public ListIntentionNoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntentionNoteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntentionNoteResponse setBody(ListIntentionNoteResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntentionNoteResponseBody getBody() {
        return this.body;
    }

}
