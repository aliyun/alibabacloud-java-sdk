// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetClearAccountThreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClearAccountThreeResponseBody body;

    public static GetClearAccountThreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClearAccountThreeResponse self = new GetClearAccountThreeResponse();
        return TeaModel.build(map, self);
    }

    public GetClearAccountThreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClearAccountThreeResponse setBody(GetClearAccountThreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClearAccountThreeResponseBody getBody() {
        return this.body;
    }

}
