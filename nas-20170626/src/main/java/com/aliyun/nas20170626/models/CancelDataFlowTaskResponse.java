// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDataFlowTaskResponseBody body;

    public static CancelDataFlowTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowTaskResponse self = new CancelDataFlowTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDataFlowTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDataFlowTaskResponse setBody(CancelDataFlowTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDataFlowTaskResponseBody getBody() {
        return this.body;
    }

}
