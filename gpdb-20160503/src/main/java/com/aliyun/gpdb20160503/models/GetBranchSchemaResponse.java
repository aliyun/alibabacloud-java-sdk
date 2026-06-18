// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetBranchSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBranchSchemaResponseBody body;

    public static GetBranchSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBranchSchemaResponse self = new GetBranchSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetBranchSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBranchSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBranchSchemaResponse setBody(GetBranchSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBranchSchemaResponseBody getBody() {
        return this.body;
    }

}
