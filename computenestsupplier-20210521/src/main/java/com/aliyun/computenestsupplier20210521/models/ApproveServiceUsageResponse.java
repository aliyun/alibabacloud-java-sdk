// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ApproveServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApproveServiceUsageResponseBody body;

    public static ApproveServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ApproveServiceUsageResponse self = new ApproveServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public ApproveServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApproveServiceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApproveServiceUsageResponse setBody(ApproveServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ApproveServiceUsageResponseBody getBody() {
        return this.body;
    }

}
