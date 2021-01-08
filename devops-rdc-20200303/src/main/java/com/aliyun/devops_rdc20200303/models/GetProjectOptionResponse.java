// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetProjectOptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectOptionResponseBody body;

    public static GetProjectOptionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectOptionResponse self = new GetProjectOptionResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectOptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectOptionResponse setBody(GetProjectOptionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectOptionResponseBody getBody() {
        return this.body;
    }

}
