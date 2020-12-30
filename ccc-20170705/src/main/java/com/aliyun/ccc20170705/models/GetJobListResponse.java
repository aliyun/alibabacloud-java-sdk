// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobListResponseBody body;

    public static GetJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobListResponse self = new GetJobListResponse();
        return TeaModel.build(map, self);
    }

    public GetJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobListResponse setBody(GetJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobListResponseBody getBody() {
        return this.body;
    }

}
