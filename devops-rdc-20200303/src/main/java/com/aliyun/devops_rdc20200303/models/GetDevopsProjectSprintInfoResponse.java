// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectSprintInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevopsProjectSprintInfoResponseBody body;

    public static GetDevopsProjectSprintInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectSprintInfoResponse self = new GetDevopsProjectSprintInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectSprintInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevopsProjectSprintInfoResponse setBody(GetDevopsProjectSprintInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevopsProjectSprintInfoResponseBody getBody() {
        return this.body;
    }

}
