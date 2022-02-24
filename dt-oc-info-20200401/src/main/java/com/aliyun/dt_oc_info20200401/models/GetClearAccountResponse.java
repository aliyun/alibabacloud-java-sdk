// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetClearAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClearAccountResponseBody body;

    public static GetClearAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClearAccountResponse self = new GetClearAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetClearAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClearAccountResponse setBody(GetClearAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClearAccountResponseBody getBody() {
        return this.body;
    }

}
