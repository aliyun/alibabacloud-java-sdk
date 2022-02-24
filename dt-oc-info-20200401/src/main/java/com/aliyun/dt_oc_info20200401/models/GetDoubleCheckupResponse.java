// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetDoubleCheckupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDoubleCheckupResponseBody body;

    public static GetDoubleCheckupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDoubleCheckupResponse self = new GetDoubleCheckupResponse();
        return TeaModel.build(map, self);
    }

    public GetDoubleCheckupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDoubleCheckupResponse setBody(GetDoubleCheckupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDoubleCheckupResponseBody getBody() {
        return this.body;
    }

}
