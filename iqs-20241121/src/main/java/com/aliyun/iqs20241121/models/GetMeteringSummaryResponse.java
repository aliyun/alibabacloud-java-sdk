// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetMeteringSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MeteringSummaryResult body;

    public static GetMeteringSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMeteringSummaryResponse self = new GetMeteringSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetMeteringSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMeteringSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMeteringSummaryResponse setBody(MeteringSummaryResult body) {
        this.body = body;
        return this;
    }
    public MeteringSummaryResult getBody() {
        return this.body;
    }

}
