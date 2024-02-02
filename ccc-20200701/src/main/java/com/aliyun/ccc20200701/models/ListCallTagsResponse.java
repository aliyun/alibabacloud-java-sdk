// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCallTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCallTagsResponseBody body;

    public static ListCallTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCallTagsResponse self = new ListCallTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListCallTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCallTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCallTagsResponse setBody(ListCallTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCallTagsResponseBody getBody() {
        return this.body;
    }

}
