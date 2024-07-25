// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CancelServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelServiceUsageResponseBody body;

    public static CancelServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelServiceUsageResponse self = new CancelServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public CancelServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelServiceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelServiceUsageResponse setBody(CancelServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelServiceUsageResponseBody getBody() {
        return this.body;
    }

}
