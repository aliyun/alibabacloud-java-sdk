// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListFlowResponseBody body;

    public static ListFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowResponse self = new ListFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowResponse setBody(ListFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowResponseBody getBody() {
        return this.body;
    }

}
