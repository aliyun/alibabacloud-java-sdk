// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskDetailActivityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskDetailActivityResponseBody body;

    public static GetTaskDetailActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailActivityResponse self = new GetTaskDetailActivityResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskDetailActivityResponse setBody(GetTaskDetailActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskDetailActivityResponseBody getBody() {
        return this.body;
    }

}
