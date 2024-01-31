// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundDetailV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightRefundDetailV2ResponseBody body;

    public static FlightRefundDetailV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundDetailV2Response self = new FlightRefundDetailV2Response();
        return TeaModel.build(map, self);
    }

    public FlightRefundDetailV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightRefundDetailV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightRefundDetailV2Response setBody(FlightRefundDetailV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightRefundDetailV2ResponseBody getBody() {
        return this.body;
    }

}
