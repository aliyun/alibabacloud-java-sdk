// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RejectServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectServiceUsageResponseBody body;

    public static RejectServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectServiceUsageResponse self = new RejectServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public RejectServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectServiceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectServiceUsageResponse setBody(RejectServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectServiceUsageResponseBody getBody() {
        return this.body;
    }

}
