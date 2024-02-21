// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDictsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDictsResponseBody body;

    public static ListDictsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDictsResponse self = new ListDictsResponse();
        return TeaModel.build(map, self);
    }

    public ListDictsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDictsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDictsResponse setBody(ListDictsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDictsResponseBody getBody() {
        return this.body;
    }

}
