// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRowPermissionByUserIdResponseBody body;

    public static ListRowPermissionByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionByUserIdResponse self = new ListRowPermissionByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRowPermissionByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRowPermissionByUserIdResponse setBody(ListRowPermissionByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRowPermissionByUserIdResponseBody getBody() {
        return this.body;
    }

}
