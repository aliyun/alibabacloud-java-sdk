// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficeEditURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOfficeEditURLResponseBody body;

    public static GetOfficeEditURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfficeEditURLResponse self = new GetOfficeEditURLResponse();
        return TeaModel.build(map, self);
    }

    public GetOfficeEditURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOfficeEditURLResponse setBody(GetOfficeEditURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOfficeEditURLResponseBody getBody() {
        return this.body;
    }

}
