// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class GetByForeignIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetByForeignIdResponseBody body;

    public static GetByForeignIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetByForeignIdResponse self = new GetByForeignIdResponse();
        return TeaModel.build(map, self);
    }

    public GetByForeignIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetByForeignIdResponse setBody(GetByForeignIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetByForeignIdResponseBody getBody() {
        return this.body;
    }

}
