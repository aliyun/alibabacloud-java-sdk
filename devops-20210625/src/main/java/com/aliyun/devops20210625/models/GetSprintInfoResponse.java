// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSprintInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSprintInfoResponseBody body;

    public static GetSprintInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSprintInfoResponse self = new GetSprintInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSprintInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSprintInfoResponse setBody(GetSprintInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSprintInfoResponseBody getBody() {
        return this.body;
    }

}
