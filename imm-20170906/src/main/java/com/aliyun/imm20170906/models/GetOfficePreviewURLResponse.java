// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetOfficePreviewURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOfficePreviewURLResponseBody body;

    public static GetOfficePreviewURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOfficePreviewURLResponse self = new GetOfficePreviewURLResponse();
        return TeaModel.build(map, self);
    }

    public GetOfficePreviewURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOfficePreviewURLResponse setBody(GetOfficePreviewURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOfficePreviewURLResponseBody getBody() {
        return this.body;
    }

}
