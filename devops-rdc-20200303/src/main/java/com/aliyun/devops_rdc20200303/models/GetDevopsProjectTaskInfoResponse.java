// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevopsProjectTaskInfoResponseBody body;

    public static GetDevopsProjectTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectTaskInfoResponse self = new GetDevopsProjectTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevopsProjectTaskInfoResponse setBody(GetDevopsProjectTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevopsProjectTaskInfoResponseBody getBody() {
        return this.body;
    }

}
