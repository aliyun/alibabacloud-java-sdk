// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSwimmingLaneResponseBody body;

    public static DeleteSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneResponse self = new DeleteSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSwimmingLaneResponse setBody(DeleteSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
