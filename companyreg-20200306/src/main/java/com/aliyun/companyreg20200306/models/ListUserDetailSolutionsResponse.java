// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserDetailSolutionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserDetailSolutionsResponseBody body;

    public static ListUserDetailSolutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserDetailSolutionsResponse self = new ListUserDetailSolutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserDetailSolutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserDetailSolutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserDetailSolutionsResponse setBody(ListUserDetailSolutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserDetailSolutionsResponseBody getBody() {
        return this.body;
    }

}
