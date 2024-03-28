// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserSolutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserSolutionsResponseBody body;

    public static ListUserSolutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserSolutionsResponse self = new ListUserSolutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserSolutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserSolutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserSolutionsResponse setBody(ListUserSolutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserSolutionsResponseBody getBody() {
        return this.body;
    }

}
