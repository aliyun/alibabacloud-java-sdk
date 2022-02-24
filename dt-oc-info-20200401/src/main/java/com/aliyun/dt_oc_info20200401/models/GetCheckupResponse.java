// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCheckupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCheckupResponseBody body;

    public static GetCheckupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckupResponse self = new GetCheckupResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckupResponse setBody(GetCheckupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckupResponseBody getBody() {
        return this.body;
    }

}
