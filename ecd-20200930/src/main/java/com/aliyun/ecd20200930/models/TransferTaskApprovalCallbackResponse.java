// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class TransferTaskApprovalCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferTaskApprovalCallbackResponseBody body;

    public static TransferTaskApprovalCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferTaskApprovalCallbackResponse self = new TransferTaskApprovalCallbackResponse();
        return TeaModel.build(map, self);
    }

    public TransferTaskApprovalCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferTaskApprovalCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferTaskApprovalCallbackResponse setBody(TransferTaskApprovalCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferTaskApprovalCallbackResponseBody getBody() {
        return this.body;
    }

}
