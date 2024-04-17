// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQuerySensResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgQuerySensResultResponseBody body;

    public static DsgQuerySensResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgQuerySensResultResponse self = new DsgQuerySensResultResponse();
        return TeaModel.build(map, self);
    }

    public DsgQuerySensResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgQuerySensResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgQuerySensResultResponse setBody(DsgQuerySensResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgQuerySensResultResponseBody getBody() {
        return this.body;
    }

}
