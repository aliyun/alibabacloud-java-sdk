// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSwimmingLaneResponseBody body;

    public static UpdateSwimmingLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneResponse self = new UpdateSwimmingLaneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSwimmingLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSwimmingLaneResponse setBody(UpdateSwimmingLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSwimmingLaneResponseBody getBody() {
        return this.body;
    }

}
