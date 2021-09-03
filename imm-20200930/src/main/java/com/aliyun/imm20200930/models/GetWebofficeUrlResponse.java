// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetWebofficeUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWebofficeUrlResponseBody body;

    public static GetWebofficeUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWebofficeUrlResponse self = new GetWebofficeUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetWebofficeUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWebofficeUrlResponse setBody(GetWebofficeUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWebofficeUrlResponseBody getBody() {
        return this.body;
    }

}
