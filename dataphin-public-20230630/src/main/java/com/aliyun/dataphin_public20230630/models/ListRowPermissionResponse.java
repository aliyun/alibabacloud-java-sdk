// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRowPermissionResponseBody body;

    public static ListRowPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionResponse self = new ListRowPermissionResponse();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRowPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRowPermissionResponse setBody(ListRowPermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRowPermissionResponseBody getBody() {
        return this.body;
    }

}
