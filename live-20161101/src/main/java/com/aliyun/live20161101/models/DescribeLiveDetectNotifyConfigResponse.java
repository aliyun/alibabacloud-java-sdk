// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectNotifyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLiveDetectNotifyConfigResponseBody body;

    public static DescribeLiveDetectNotifyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectNotifyConfigResponse self = new DescribeLiveDetectNotifyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectNotifyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLiveDetectNotifyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLiveDetectNotifyConfigResponse setBody(DescribeLiveDetectNotifyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLiveDetectNotifyConfigResponseBody getBody() {
        return this.body;
    }

}
