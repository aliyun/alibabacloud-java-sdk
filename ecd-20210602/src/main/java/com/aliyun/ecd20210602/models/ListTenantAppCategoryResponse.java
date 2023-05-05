// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTenantAppCategoryResponseBody body;

    public static ListTenantAppCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppCategoryResponse self = new ListTenantAppCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantAppCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantAppCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantAppCategoryResponse setBody(ListTenantAppCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantAppCategoryResponseBody getBody() {
        return this.body;
    }

}
