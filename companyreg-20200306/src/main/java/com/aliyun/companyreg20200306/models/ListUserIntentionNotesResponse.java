// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserIntentionNotesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserIntentionNotesResponseBody body;

    public static ListUserIntentionNotesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserIntentionNotesResponse self = new ListUserIntentionNotesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserIntentionNotesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserIntentionNotesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserIntentionNotesResponse setBody(ListUserIntentionNotesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserIntentionNotesResponseBody getBody() {
        return this.body;
    }

}
