// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListTenantConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTenantConfigResponseBody body;

    public static ListTenantConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantConfigResponse self = new ListTenantConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTenantConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTenantConfigResponse setBody(ListTenantConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTenantConfigResponseBody getBody() {
        return this.body;
    }

}
