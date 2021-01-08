// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDashboardUidResponseBody body;

    public static ListDashboardUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardUidResponse self = new ListDashboardUidResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardUidResponse setBody(ListDashboardUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardUidResponseBody getBody() {
        return this.body;
    }

}
