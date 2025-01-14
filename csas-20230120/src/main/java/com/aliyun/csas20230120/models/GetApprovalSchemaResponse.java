// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApprovalSchemaResponseBody body;

    public static GetApprovalSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalSchemaResponse self = new GetApprovalSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetApprovalSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApprovalSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApprovalSchemaResponse setBody(GetApprovalSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApprovalSchemaResponseBody getBody() {
        return this.body;
    }

}
