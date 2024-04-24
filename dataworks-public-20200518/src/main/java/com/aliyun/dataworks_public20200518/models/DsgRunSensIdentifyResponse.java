// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgRunSensIdentifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgRunSensIdentifyResponseBody body;

    public static DsgRunSensIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgRunSensIdentifyResponse self = new DsgRunSensIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public DsgRunSensIdentifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgRunSensIdentifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgRunSensIdentifyResponse setBody(DsgRunSensIdentifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgRunSensIdentifyResponseBody getBody() {
        return this.body;
    }

}
