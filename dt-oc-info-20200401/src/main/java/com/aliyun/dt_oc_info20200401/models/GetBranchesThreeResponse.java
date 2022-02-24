// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetBranchesThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBranchesThreeResponseBody body;

    public static GetBranchesThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBranchesThreeResponse self = new GetBranchesThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetBranchesThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBranchesThreeResponse setBody(GetBranchesThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBranchesThreeResponseBody getBody() {
        return this.body;
    }

}
