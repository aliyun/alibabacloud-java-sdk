// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public InsertServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertServiceGroupResponse setBody(InsertServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertServiceGroupResponseBody getBody() {
        return this.body;
    }

}
