// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class GetAddressDivisionCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAddressDivisionCodeResponseBody body;

    public static GetAddressDivisionCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAddressDivisionCodeResponse self = new GetAddressDivisionCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAddressDivisionCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAddressDivisionCodeResponse setBody(GetAddressDivisionCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAddressDivisionCodeResponseBody getBody() {
        return this.body;
    }

}
