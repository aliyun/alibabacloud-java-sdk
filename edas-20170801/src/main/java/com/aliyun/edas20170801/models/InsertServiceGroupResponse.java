// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertServiceGroupResponseBody body;

    public static InsertServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertServiceGroupResponse self = new InsertServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public InsertServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertServiceGroupResponse setBody(InsertServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertServiceGroupResponseBody getBody() {
        return this.body;
    }

}
