// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayResourceQuotaUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGatewayResourceQuotaUsageResponseBody body;

    public static GetGatewayResourceQuotaUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResourceQuotaUsageResponse self = new GetGatewayResourceQuotaUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayResourceQuotaUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayResourceQuotaUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayResourceQuotaUsageResponse setBody(GetGatewayResourceQuotaUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayResourceQuotaUsageResponseBody getBody() {
        return this.body;
    }

}
