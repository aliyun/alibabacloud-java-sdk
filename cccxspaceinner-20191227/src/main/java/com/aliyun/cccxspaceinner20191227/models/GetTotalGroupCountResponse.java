// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTotalGroupCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTotalGroupCountResponseBody body;

    public static GetTotalGroupCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTotalGroupCountResponse self = new GetTotalGroupCountResponse();
        return TeaModel.build(map, self);
    }

    public GetTotalGroupCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTotalGroupCountResponse setBody(GetTotalGroupCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTotalGroupCountResponseBody getBody() {
        return this.body;
    }

}
