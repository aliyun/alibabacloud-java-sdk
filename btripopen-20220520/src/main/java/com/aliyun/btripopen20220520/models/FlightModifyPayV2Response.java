// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyPayV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightModifyPayV2ResponseBody body;

    public static FlightModifyPayV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyPayV2Response self = new FlightModifyPayV2Response();
        return TeaModel.build(map, self);
    }

    public FlightModifyPayV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightModifyPayV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightModifyPayV2Response setBody(FlightModifyPayV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightModifyPayV2ResponseBody getBody() {
        return this.body;
    }

}
