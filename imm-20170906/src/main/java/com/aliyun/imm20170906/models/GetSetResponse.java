// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSetResponseBody body;

    public static GetSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSetResponse self = new GetSetResponse();
        return TeaModel.build(map, self);
    }

    public GetSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSetResponse setBody(GetSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSetResponseBody getBody() {
        return this.body;
    }

}
