// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricProfilingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudMetricProfilingResponseBody body;

    public static GetCloudMetricProfilingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudMetricProfilingResponse self = new GetCloudMetricProfilingResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudMetricProfilingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudMetricProfilingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudMetricProfilingResponse setBody(GetCloudMetricProfilingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudMetricProfilingResponseBody getBody() {
        return this.body;
    }

}
