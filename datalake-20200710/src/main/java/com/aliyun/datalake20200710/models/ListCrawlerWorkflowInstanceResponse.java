// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCrawlerWorkflowInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCrawlerWorkflowInstanceResponseBody body;

    public static ListCrawlerWorkflowInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerWorkflowInstanceResponse self = new ListCrawlerWorkflowInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListCrawlerWorkflowInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCrawlerWorkflowInstanceResponse setBody(ListCrawlerWorkflowInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCrawlerWorkflowInstanceResponseBody getBody() {
        return this.body;
    }

}
