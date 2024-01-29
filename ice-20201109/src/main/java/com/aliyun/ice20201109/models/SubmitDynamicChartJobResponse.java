// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicChartJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SubmitDynamicChartJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDynamicChartJobResponse setBody(SubmitDynamicChartJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDynamicChartJobResponseBody getBody() {
        return this.body;
    }

}
