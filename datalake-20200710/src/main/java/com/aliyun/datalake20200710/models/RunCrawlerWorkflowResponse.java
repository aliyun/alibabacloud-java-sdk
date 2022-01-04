// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunCrawlerWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunCrawlerWorkflowResponseBody body;

    public static RunCrawlerWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCrawlerWorkflowResponse self = new RunCrawlerWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RunCrawlerWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCrawlerWorkflowResponse setBody(RunCrawlerWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCrawlerWorkflowResponseBody getBody() {
        return this.body;
    }

}
