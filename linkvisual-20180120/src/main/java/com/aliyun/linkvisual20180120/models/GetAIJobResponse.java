// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAIJobResponseBody body;

    public static GetAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIJobResponse self = new GetAIJobResponse();
        return TeaModel.build(map, self);
    }

    public GetAIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAIJobResponse setBody(GetAIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAIJobResponseBody getBody() {
        return this.body;
    }

}
