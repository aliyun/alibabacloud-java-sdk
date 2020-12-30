// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskListResponseBody body;

    public static GetTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskListResponse self = new GetTaskListResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskListResponse setBody(GetTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskListResponseBody getBody() {
        return this.body;
    }

}
