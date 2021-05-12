// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetEnvironmentLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnvironmentLogResponseBody body;

    public static GetEnvironmentLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLogResponse self = new GetEnvironmentLogResponse();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnvironmentLogResponse setBody(GetEnvironmentLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnvironmentLogResponseBody getBody() {
        return this.body;
    }

}
