// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CancelDataFlowSubTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelDataFlowSubTaskResponseBody body;

    public static CancelDataFlowSubTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDataFlowSubTaskResponse self = new CancelDataFlowSubTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelDataFlowSubTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDataFlowSubTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelDataFlowSubTaskResponse setBody(CancelDataFlowSubTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDataFlowSubTaskResponseBody getBody() {
        return this.body;
    }

}
