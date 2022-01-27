// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetErrorRequestSampleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetErrorRequestSampleResponseBody body;

    public static GetErrorRequestSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErrorRequestSampleResponse self = new GetErrorRequestSampleResponse();
        return TeaModel.build(map, self);
    }

    public GetErrorRequestSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErrorRequestSampleResponse setBody(GetErrorRequestSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErrorRequestSampleResponseBody getBody() {
        return this.body;
    }

}
