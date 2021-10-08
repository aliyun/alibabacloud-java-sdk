// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetRootCauseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRootCauseResponseBody body;

    public static GetRootCauseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRootCauseResponse self = new GetRootCauseResponse();
        return TeaModel.build(map, self);
    }

    public GetRootCauseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRootCauseResponse setBody(GetRootCauseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRootCauseResponseBody getBody() {
        return this.body;
    }

}
