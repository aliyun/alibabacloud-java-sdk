// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListKeywordLibsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKeywordLibsResponseBody body;

    public static ListKeywordLibsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKeywordLibsResponse self = new ListKeywordLibsResponse();
        return TeaModel.build(map, self);
    }

    public ListKeywordLibsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKeywordLibsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKeywordLibsResponse setBody(ListKeywordLibsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKeywordLibsResponseBody getBody() {
        return this.body;
    }

}
