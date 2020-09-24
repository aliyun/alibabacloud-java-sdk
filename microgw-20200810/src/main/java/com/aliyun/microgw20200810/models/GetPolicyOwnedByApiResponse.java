// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetPolicyOwnedByApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPolicyOwnedByApiResponseBody body;

    public static GetPolicyOwnedByApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyOwnedByApiResponse self = new GetPolicyOwnedByApiResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyOwnedByApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyOwnedByApiResponse setBody(GetPolicyOwnedByApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyOwnedByApiResponseBody getBody() {
        return this.body;
    }

}
