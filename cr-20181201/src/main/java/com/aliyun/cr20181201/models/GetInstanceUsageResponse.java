// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetInstanceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceUsageResponseBody body;

    public static GetInstanceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceUsageResponse self = new GetInstanceUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceUsageResponse setBody(GetInstanceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceUsageResponseBody getBody() {
        return this.body;
    }

}
