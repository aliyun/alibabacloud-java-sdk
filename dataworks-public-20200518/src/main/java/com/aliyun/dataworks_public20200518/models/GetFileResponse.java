// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFileResponseBody body;

    public static GetFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileResponse self = new GetFileResponse();
        return TeaModel.build(map, self);
    }

    public GetFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileResponse setBody(GetFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileResponseBody getBody() {
        return this.body;
    }

}
