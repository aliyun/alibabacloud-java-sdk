// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class InvalidateApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvalidateApprovalResponseBody body;

    public static InvalidateApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        InvalidateApprovalResponse self = new InvalidateApprovalResponse();
        return TeaModel.build(map, self);
    }

    public InvalidateApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvalidateApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvalidateApprovalResponse setBody(InvalidateApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public InvalidateApprovalResponseBody getBody() {
        return this.body;
    }

}
