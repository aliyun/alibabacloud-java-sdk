// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FlightRefundApplyV2ResponseBody body;

    public static FlightRefundApplyV2Response build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyV2Response self = new FlightRefundApplyV2Response();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FlightRefundApplyV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FlightRefundApplyV2Response setBody(FlightRefundApplyV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public FlightRefundApplyV2ResponseBody getBody() {
        return this.body;
    }

}
