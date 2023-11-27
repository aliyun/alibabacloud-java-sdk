// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class DismissGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DismissGroupResponseBody body;

    public static DismissGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DismissGroupResponse self = new DismissGroupResponse();
        return TeaModel.build(map, self);
    }

    public DismissGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DismissGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DismissGroupResponse setBody(DismissGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DismissGroupResponseBody getBody() {
        return this.body;
    }

}
