// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetWorkItemInfoResponseBody body;

    public static GetWorkItemInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemInfoResponse self = new GetWorkItemInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkItemInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkItemInfoResponse setBody(GetWorkItemInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkItemInfoResponseBody getBody() {
        return this.body;
    }

}
