// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDataPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataPermissionsResponseBody body;

    public static ListDataPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataPermissionsResponse self = new ListDataPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataPermissionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataPermissionsResponse setBody(ListDataPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataPermissionsResponseBody getBody() {
        return this.body;
    }

}
