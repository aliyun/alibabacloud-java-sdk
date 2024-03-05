// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class RefuseDemandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefuseDemandResponseBody body;

    public static RefuseDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseDemandResponse self = new RefuseDemandResponse();
        return TeaModel.build(map, self);
    }

    public RefuseDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefuseDemandResponse setBody(RefuseDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseDemandResponseBody getBody() {
        return this.body;
    }

}
