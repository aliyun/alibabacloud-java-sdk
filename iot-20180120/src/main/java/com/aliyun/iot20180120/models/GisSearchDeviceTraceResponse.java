// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GisSearchDeviceTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GisSearchDeviceTraceResponseBody body;

    public static GisSearchDeviceTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        GisSearchDeviceTraceResponse self = new GisSearchDeviceTraceResponse();
        return TeaModel.build(map, self);
    }

    public GisSearchDeviceTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GisSearchDeviceTraceResponse setBody(GisSearchDeviceTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public GisSearchDeviceTraceResponseBody getBody() {
        return this.body;
    }

}
