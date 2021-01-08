// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskDetailBaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskDetailBaseResponseBody body;

    public static GetTaskDetailBaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskDetailBaseResponse self = new GetTaskDetailBaseResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskDetailBaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskDetailBaseResponse setBody(GetTaskDetailBaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskDetailBaseResponseBody getBody() {
        return this.body;
    }

}
