// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightExceedApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightExceedApplyQueryResponseBody body;

    public static FlightExceedApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        FlightExceedApplyQueryResponse self = new FlightExceedApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public FlightExceedApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightExceedApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightExceedApplyQueryResponse setBody(FlightExceedApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightExceedApplyQueryResponseBody getBody() {
        return this.body;
    }

}
