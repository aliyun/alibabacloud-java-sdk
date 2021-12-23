// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicChartJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDynamicChartJobResponseBody body;

    public static SubmitDynamicChartJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicChartJobResponse self = new SubmitDynamicChartJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicChartJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDynamicChartJobResponse setBody(SubmitDynamicChartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDynamicChartJobResponseBody getBody() {
        return this.body;
    }

}
