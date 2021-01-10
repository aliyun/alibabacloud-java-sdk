// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class ListUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsageResponseBody body;

    public static ListUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsageResponse self = new ListUsageResponse();
        return TeaModel.build(map, self);
    }

    public ListUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsageResponse setBody(ListUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsageResponseBody getBody() {
        return this.body;
    }

}
