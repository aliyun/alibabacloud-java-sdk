// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListResourcePermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourcePermissionsResponseBody body;

    public static ListResourcePermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcePermissionsResponse self = new ListResourcePermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcePermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourcePermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourcePermissionsResponse setBody(ListResourcePermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourcePermissionsResponseBody getBody() {
        return this.body;
    }

}
