// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobGroupResponseBody body;

    public static GetJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobGroupResponse self = new GetJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobGroupResponse setBody(GetJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobGroupResponseBody getBody() {
        return this.body;
    }

}
