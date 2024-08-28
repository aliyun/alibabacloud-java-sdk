// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListTenantAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTenantAddonsResponseBody body;

    public static ListTenantAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAddonsResponse self = new ListTenantAddonsResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantAddonsResponse setBody(ListTenantAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantAddonsResponseBody getBody() {
        return this.body;
    }

}
