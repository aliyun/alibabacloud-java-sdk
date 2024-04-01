// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBlacklistCallTaggingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBlacklistCallTaggingsResponseBody body;

    public static ListBlacklistCallTaggingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlacklistCallTaggingsResponse self = new ListBlacklistCallTaggingsResponse();
        return TeaModel.build(map, self);
    }

    public ListBlacklistCallTaggingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBlacklistCallTaggingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBlacklistCallTaggingsResponse setBody(ListBlacklistCallTaggingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBlacklistCallTaggingsResponseBody getBody() {
        return this.body;
    }

}
