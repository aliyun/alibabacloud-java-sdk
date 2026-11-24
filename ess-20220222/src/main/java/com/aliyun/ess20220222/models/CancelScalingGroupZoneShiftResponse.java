// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class CancelScalingGroupZoneShiftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelScalingGroupZoneShiftResponseBody body;

    public static CancelScalingGroupZoneShiftResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelScalingGroupZoneShiftResponse self = new CancelScalingGroupZoneShiftResponse();
        return TeaModel.build(map, self);
    }

    public CancelScalingGroupZoneShiftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelScalingGroupZoneShiftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelScalingGroupZoneShiftResponse setBody(CancelScalingGroupZoneShiftResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelScalingGroupZoneShiftResponseBody getBody() {
        return this.body;
    }

}
