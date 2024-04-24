// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgStopSensIdentifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgStopSensIdentifyResponseBody body;

    public static DsgStopSensIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgStopSensIdentifyResponse self = new DsgStopSensIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public DsgStopSensIdentifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgStopSensIdentifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgStopSensIdentifyResponse setBody(DsgStopSensIdentifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgStopSensIdentifyResponseBody getBody() {
        return this.body;
    }

}
