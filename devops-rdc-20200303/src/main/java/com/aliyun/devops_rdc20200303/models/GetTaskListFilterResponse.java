// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetTaskListFilterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskListFilterResponseBody body;

    public static GetTaskListFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListFilterResponse self = new GetTaskListFilterResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskListFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskListFilterResponse setBody(GetTaskListFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskListFilterResponseBody getBody() {
        return this.body;
    }

}
