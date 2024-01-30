// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertSwimmingLaneResponseBody body;

    public static InsertSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneResponse self = new InsertSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertSwimmingLaneResponse setBody(InsertSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
