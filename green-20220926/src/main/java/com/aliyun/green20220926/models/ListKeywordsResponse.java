// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListKeywordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKeywordsResponseBody body;

    public static ListKeywordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeywordsResponse self = new ListKeywordsResponse();
        return TeaModel.build(map, self);
    }

    public ListKeywordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeywordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKeywordsResponse setBody(ListKeywordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeywordsResponseBody getBody() {
        return this.body;
    }

}
