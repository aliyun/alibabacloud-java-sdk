// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetJobStatusByCallIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJobStatusByCallIdResponseBody body;

    public static GetJobStatusByCallIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobStatusByCallIdResponse self = new GetJobStatusByCallIdResponse();
        return TeaModel.build(map, self);
    }

    public GetJobStatusByCallIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobStatusByCallIdResponse setBody(GetJobStatusByCallIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobStatusByCallIdResponseBody getBody() {
        return this.body;
    }

}
