// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCancelOrderV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightCancelOrderV2ResponseBody body;

    public static FlightCancelOrderV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightCancelOrderV2Response self = new FlightCancelOrderV2Response();
        return TeaModel.build(map, self);
    }

    public FlightCancelOrderV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightCancelOrderV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightCancelOrderV2Response setBody(FlightCancelOrderV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightCancelOrderV2ResponseBody getBody() {
        return this.body;
    }

}
