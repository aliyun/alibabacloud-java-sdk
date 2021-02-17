// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetWebofficeURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebofficeURLResponseBody body;

    public static GetWebofficeURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeURLResponse self = new GetWebofficeURLResponse();
        return TeaModel.build(map, self);
    }

    public GetWebofficeURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebofficeURLResponse setBody(GetWebofficeURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebofficeURLResponseBody getBody() {
        return this.body;
    }

}
