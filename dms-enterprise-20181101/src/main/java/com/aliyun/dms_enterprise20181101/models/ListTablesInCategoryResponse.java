// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTablesInCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTablesInCategoryResponseBody body;

    public static ListTablesInCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTablesInCategoryResponse self = new ListTablesInCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListTablesInCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTablesInCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTablesInCategoryResponse setBody(ListTablesInCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTablesInCategoryResponseBody getBody() {
        return this.body;
    }

}
