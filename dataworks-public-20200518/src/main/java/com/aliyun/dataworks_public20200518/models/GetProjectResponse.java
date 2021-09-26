// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProjectResponseBody body;

    public static GetProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponse self = new GetProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectResponse setBody(GetProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectResponseBody getBody() {
        return this.body;
    }

}
