// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTenantAppResponseBody body;

    public static ListTenantAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppResponse self = new ListTenantAppResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantAppResponse setBody(ListTenantAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantAppResponseBody getBody() {
        return this.body;
    }

}
