// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCopyrightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCopyrightResponseBody body;

    public static GetCopyrightResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCopyrightResponse self = new GetCopyrightResponse();
        return TeaModel.build(map, self);
    }

    public GetCopyrightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCopyrightResponse setBody(GetCopyrightResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCopyrightResponseBody getBody() {
        return this.body;
    }

}
