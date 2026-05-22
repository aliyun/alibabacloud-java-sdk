// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushTimesUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushTimesUsageResponseBody body;

    public static PushTimesUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        PushTimesUsageResponse self = new PushTimesUsageResponse();
        return TeaModel.build(map, self);
    }

    public PushTimesUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushTimesUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushTimesUsageResponse setBody(PushTimesUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public PushTimesUsageResponseBody getBody() {
        return this.body;
    }

}
