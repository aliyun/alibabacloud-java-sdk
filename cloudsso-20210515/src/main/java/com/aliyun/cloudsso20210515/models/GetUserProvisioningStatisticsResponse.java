// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserProvisioningStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
