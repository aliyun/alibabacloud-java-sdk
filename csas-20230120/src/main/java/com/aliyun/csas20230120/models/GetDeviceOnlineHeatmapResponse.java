// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceOnlineHeatmapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceOnlineHeatmapResponseBody body;

    public static GetDeviceOnlineHeatmapResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceOnlineHeatmapResponse self = new GetDeviceOnlineHeatmapResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceOnlineHeatmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceOnlineHeatmapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceOnlineHeatmapResponse setBody(GetDeviceOnlineHeatmapResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceOnlineHeatmapResponseBody getBody() {
        return this.body;
    }

}
