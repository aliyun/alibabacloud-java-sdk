// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserProvisioningStatisticsResponseBody body;

    public static GetUserProvisioningStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserProvisioningStatisticsResponse self = new GetUserProvisioningStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserProvisioningStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserProvisioningStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserProvisioningStatisticsResponse setBody(GetUserProvisioningStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserProvisioningStatisticsResponseBody getBody() {
        return this.body;
    }

}
