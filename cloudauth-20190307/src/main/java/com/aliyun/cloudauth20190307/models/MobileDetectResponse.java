// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class MobileDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MobileDetectResponseBody body;

    public static MobileDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        MobileDetectResponse self = new MobileDetectResponse();
        return TeaModel.build(map, self);
    }

    public MobileDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MobileDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MobileDetectResponse setBody(MobileDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public MobileDetectResponseBody getBody() {
        return this.body;
    }

}
