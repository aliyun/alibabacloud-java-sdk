// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightRefundPreCalV2ResponseBody body;

    public static FlightRefundPreCalV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalV2Response self = new FlightRefundPreCalV2Response();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightRefundPreCalV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightRefundPreCalV2Response setBody(FlightRefundPreCalV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightRefundPreCalV2ResponseBody getBody() {
        return this.body;
    }

}
