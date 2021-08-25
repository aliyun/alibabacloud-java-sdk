// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class RefundVnoBatchInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefundVnoBatchInstancesResponseBody body;

    public static RefundVnoBatchInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundVnoBatchInstancesResponse self = new RefundVnoBatchInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RefundVnoBatchInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundVnoBatchInstancesResponse setBody(RefundVnoBatchInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundVnoBatchInstancesResponseBody getBody() {
        return this.body;
    }

}
