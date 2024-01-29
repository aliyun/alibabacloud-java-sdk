// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetBranchInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBranchInfoResponseBody body;

    public static GetBranchInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBranchInfoResponse self = new GetBranchInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBranchInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBranchInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBranchInfoResponse setBody(GetBranchInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBranchInfoResponseBody getBody() {
        return this.body;
    }

}
