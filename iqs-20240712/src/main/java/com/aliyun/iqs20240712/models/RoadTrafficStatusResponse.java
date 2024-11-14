// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20240712.models;

import com.aliyun.tea.*;

public class RoadTrafficStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RoadTrafficStatusResponseBody body;

    public static RoadTrafficStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        RoadTrafficStatusResponse self = new RoadTrafficStatusResponse();
        return TeaModel.build(map, self);
    }

    public RoadTrafficStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RoadTrafficStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RoadTrafficStatusResponse setBody(RoadTrafficStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public RoadTrafficStatusResponseBody getBody() {
        return this.body;
    }

}
