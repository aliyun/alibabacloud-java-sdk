// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCustomsCreditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomsCreditResponseBody body;

    public static GetCustomsCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomsCreditResponse self = new GetCustomsCreditResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomsCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomsCreditResponse setBody(GetCustomsCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomsCreditResponseBody getBody() {
        return this.body;
    }

}
