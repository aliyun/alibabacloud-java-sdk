// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailTopoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiAppDetailTopoResponseBody body;

    public static GetAiAppDetailTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailTopoResponse self = new GetAiAppDetailTopoResponse();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailTopoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiAppDetailTopoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiAppDetailTopoResponse setBody(GetAiAppDetailTopoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiAppDetailTopoResponseBody getBody() {
        return this.body;
    }

}
