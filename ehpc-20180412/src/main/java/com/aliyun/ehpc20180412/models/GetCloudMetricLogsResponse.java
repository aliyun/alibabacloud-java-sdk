// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudMetricLogsResponseBody body;

    public static GetCloudMetricLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricLogsResponse self = new GetCloudMetricLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudMetricLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudMetricLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudMetricLogsResponse setBody(GetCloudMetricLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudMetricLogsResponseBody getBody() {
        return this.body;
    }

}
