// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class GetFaceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFaceAttributeResponseBody body;

    public static GetFaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceAttributeResponse self = new GetFaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFaceAttributeResponse setBody(GetFaceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFaceAttributeResponseBody getBody() {
        return this.body;
    }

}
