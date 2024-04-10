// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepoTagResponseBody body;

    public static ListRepoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagResponse self = new ListRepoTagResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoTagResponse setBody(ListRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepoTagResponseBody getBody() {
        return this.body;
    }

}
