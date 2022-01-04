// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopCrawlerWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopCrawlerWorkflowResponseBody body;

    public static StopCrawlerWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCrawlerWorkflowResponse self = new StopCrawlerWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public StopCrawlerWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCrawlerWorkflowResponse setBody(StopCrawlerWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCrawlerWorkflowResponseBody getBody() {
        return this.body;
    }

}
