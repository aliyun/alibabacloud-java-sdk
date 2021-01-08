// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetDevopsProjectInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevopsProjectInfoResponseBody body;

    public static GetDevopsProjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevopsProjectInfoResponse self = new GetDevopsProjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDevopsProjectInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevopsProjectInfoResponse setBody(GetDevopsProjectInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevopsProjectInfoResponseBody getBody() {
        return this.body;
    }

}
