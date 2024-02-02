// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ResetDeviceTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDeviceTimelineResponseBody body;

    public static ResetDeviceTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceTimelineResponse self = new ResetDeviceTimelineResponse();
        return TeaModel.build(map, self);
    }

    public ResetDeviceTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDeviceTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDeviceTimelineResponse setBody(ResetDeviceTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDeviceTimelineResponseBody getBody() {
        return this.body;
    }

}
