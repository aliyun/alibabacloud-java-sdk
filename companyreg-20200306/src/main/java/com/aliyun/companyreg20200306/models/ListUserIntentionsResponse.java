// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserIntentionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserIntentionsResponseBody body;

    public static ListUserIntentionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserIntentionsResponse self = new ListUserIntentionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserIntentionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserIntentionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserIntentionsResponse setBody(ListUserIntentionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserIntentionsResponseBody getBody() {
        return this.body;
    }

}
