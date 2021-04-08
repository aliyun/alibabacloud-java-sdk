// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetDocAddResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDocAddResponseBody body;

    public static GetDocAddResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDocAddResponse self = new GetDocAddResponse();
        return TeaModel.build(map, self);
    }

    public GetDocAddResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDocAddResponse setBody(GetDocAddResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDocAddResponseBody getBody() {
        return this.body;
    }

}
