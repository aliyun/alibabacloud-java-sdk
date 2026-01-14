// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetIndexMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIndexMonitorResponseBody body;

    public static GetIndexMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIndexMonitorResponse self = new GetIndexMonitorResponse();
        return TeaModel.build(map, self);
    }

    public GetIndexMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIndexMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIndexMonitorResponse setBody(GetIndexMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIndexMonitorResponseBody getBody() {
        return this.body;
    }

}
