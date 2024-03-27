// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserTenantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserTenantsResponseBody body;

    public static ListUserTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserTenantsResponse self = new ListUserTenantsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserTenantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserTenantsResponse setBody(ListUserTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserTenantsResponseBody getBody() {
        return this.body;
    }

}
