// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetBranchInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetBranchInfoResponse setBody(GetBranchInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBranchInfoResponseBody getBody() {
        return this.body;
    }

}
