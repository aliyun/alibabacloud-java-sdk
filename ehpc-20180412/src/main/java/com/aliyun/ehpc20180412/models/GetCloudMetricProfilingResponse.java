// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetCloudMetricProfilingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetCloudMetricProfilingResponse setBody(GetCloudMetricProfilingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudMetricProfilingResponseBody getBody() {
        return this.body;
    }

}
