// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowJobsResponseBody body;

    public static ListFlowJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobsResponse self = new ListFlowJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowJobsResponse setBody(ListFlowJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowJobsResponseBody getBody() {
        return this.body;
    }

}
