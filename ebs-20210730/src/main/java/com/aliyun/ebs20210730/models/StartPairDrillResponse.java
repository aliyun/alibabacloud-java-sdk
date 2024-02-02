// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartPairDrillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartPairDrillResponseBody body;

    public static StartPairDrillResponse build(java.util.Map<String, ?> map) throws Exception {
        StartPairDrillResponse self = new StartPairDrillResponse();
        return TeaModel.build(map, self);
    }

    public StartPairDrillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartPairDrillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartPairDrillResponse setBody(StartPairDrillResponseBody body) {
        this.body = body;
        return this;
    }
    public StartPairDrillResponseBody getBody() {
        return this.body;
    }

}
