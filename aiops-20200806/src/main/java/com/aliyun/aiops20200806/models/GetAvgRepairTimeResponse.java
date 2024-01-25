// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAvgRepairTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAvgRepairTimeResponseBody body;

    public static GetAvgRepairTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvgRepairTimeResponse self = new GetAvgRepairTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetAvgRepairTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvgRepairTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAvgRepairTimeResponse setBody(GetAvgRepairTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvgRepairTimeResponseBody getBody() {
        return this.body;
    }

}
