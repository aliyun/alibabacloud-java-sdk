// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetArmsAgentDownLoadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetArmsAgentDownLoadUrlResponseBody body;

    public static GetArmsAgentDownLoadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetArmsAgentDownLoadUrlResponse self = new GetArmsAgentDownLoadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetArmsAgentDownLoadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetArmsAgentDownLoadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetArmsAgentDownLoadUrlResponse setBody(GetArmsAgentDownLoadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetArmsAgentDownLoadUrlResponseBody getBody() {
        return this.body;
    }

}
