// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFlowControlTaskReferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowControlTaskReferenceResponseBody body;

    public static ListFlowControlTaskReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowControlTaskReferenceResponse self = new ListFlowControlTaskReferenceResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowControlTaskReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowControlTaskReferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowControlTaskReferenceResponse setBody(ListFlowControlTaskReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowControlTaskReferenceResponseBody getBody() {
        return this.body;
    }

}
