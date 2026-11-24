// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartScalingGroupZoneShiftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartScalingGroupZoneShiftResponseBody body;

    public static StartScalingGroupZoneShiftResponse build(java.util.Map<String, ?> map) throws Exception {
        StartScalingGroupZoneShiftResponse self = new StartScalingGroupZoneShiftResponse();
        return TeaModel.build(map, self);
    }

    public StartScalingGroupZoneShiftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartScalingGroupZoneShiftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartScalingGroupZoneShiftResponse setBody(StartScalingGroupZoneShiftResponseBody body) {
        this.body = body;
        return this;
    }
    public StartScalingGroupZoneShiftResponseBody getBody() {
        return this.body;
    }

}
