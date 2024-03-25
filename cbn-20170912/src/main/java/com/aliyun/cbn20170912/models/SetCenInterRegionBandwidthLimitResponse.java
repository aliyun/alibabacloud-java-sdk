// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class SetCenInterRegionBandwidthLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCenInterRegionBandwidthLimitResponseBody body;

    public static SetCenInterRegionBandwidthLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCenInterRegionBandwidthLimitResponse self = new SetCenInterRegionBandwidthLimitResponse();
        return TeaModel.build(map, self);
    }

    public SetCenInterRegionBandwidthLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCenInterRegionBandwidthLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCenInterRegionBandwidthLimitResponse setBody(SetCenInterRegionBandwidthLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCenInterRegionBandwidthLimitResponseBody getBody() {
        return this.body;
    }

}
