// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertConfigCenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertConfigCenterResponseBody body;

    public static InsertConfigCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertConfigCenterResponse self = new InsertConfigCenterResponse();
        return TeaModel.build(map, self);
    }

    public InsertConfigCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertConfigCenterResponse setBody(InsertConfigCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertConfigCenterResponseBody getBody() {
        return this.body;
    }

}
