// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPermissionApplyOrdersResponseBody body;

    public static ListPermissionApplyOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionApplyOrdersResponse self = new ListPermissionApplyOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListPermissionApplyOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPermissionApplyOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPermissionApplyOrdersResponse setBody(ListPermissionApplyOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionApplyOrdersResponseBody getBody() {
        return this.body;
    }

}
