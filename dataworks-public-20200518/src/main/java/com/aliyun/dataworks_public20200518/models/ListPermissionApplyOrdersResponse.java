// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPermissionApplyOrdersResponse setBody(ListPermissionApplyOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPermissionApplyOrdersResponseBody getBody() {
        return this.body;
    }

}
