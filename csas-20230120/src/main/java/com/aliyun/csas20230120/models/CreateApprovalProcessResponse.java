// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateApprovalProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApprovalProcessResponseBody body;

    public static CreateApprovalProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApprovalProcessResponse self = new CreateApprovalProcessResponse();
        return TeaModel.build(map, self);
    }

    public CreateApprovalProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApprovalProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApprovalProcessResponse setBody(CreateApprovalProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApprovalProcessResponseBody getBody() {
        return this.body;
    }

}
