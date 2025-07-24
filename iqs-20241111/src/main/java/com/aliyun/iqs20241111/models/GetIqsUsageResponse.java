// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GetIqsUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIqsUsageResult body;

    public static GetIqsUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIqsUsageResponse self = new GetIqsUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetIqsUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIqsUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIqsUsageResponse setBody(GetIqsUsageResult body) {
        this.body = body;
        return this;
    }
    public GetIqsUsageResult getBody() {
        return this.body;
    }

}
