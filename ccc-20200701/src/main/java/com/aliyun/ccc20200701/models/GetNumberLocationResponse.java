// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetNumberLocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNumberLocationResponseBody body;

    public static GetNumberLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNumberLocationResponse self = new GetNumberLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetNumberLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNumberLocationResponse setBody(GetNumberLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNumberLocationResponseBody getBody() {
        return this.body;
    }

}
