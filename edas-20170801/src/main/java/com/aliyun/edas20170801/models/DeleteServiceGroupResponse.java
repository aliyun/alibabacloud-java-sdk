// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteServiceGroupResponseBody body;

    public static DeleteServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupResponse self = new DeleteServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServiceGroupResponse setBody(DeleteServiceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceGroupResponseBody getBody() {
        return this.body;
    }

}
