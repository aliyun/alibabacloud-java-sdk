// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowProjectResponseBody body;

    public static ListFlowProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowProjectResponse self = new ListFlowProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowProjectResponse setBody(ListFlowProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowProjectResponseBody getBody() {
        return this.body;
    }

}
