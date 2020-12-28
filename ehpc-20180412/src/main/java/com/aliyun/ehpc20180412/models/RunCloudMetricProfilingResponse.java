// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RunCloudMetricProfilingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunCloudMetricProfilingResponseBody body;

    public static RunCloudMetricProfilingResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCloudMetricProfilingResponse self = new RunCloudMetricProfilingResponse();
        return TeaModel.build(map, self);
    }

    public RunCloudMetricProfilingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCloudMetricProfilingResponse setBody(RunCloudMetricProfilingResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCloudMetricProfilingResponseBody getBody() {
        return this.body;
    }

}
