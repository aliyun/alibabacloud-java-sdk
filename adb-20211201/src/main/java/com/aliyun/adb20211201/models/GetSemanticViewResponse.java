// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSemanticViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSemanticViewResponseBody body;

    public static GetSemanticViewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSemanticViewResponse self = new GetSemanticViewResponse();
        return TeaModel.build(map, self);
    }

    public GetSemanticViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSemanticViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSemanticViewResponse setBody(GetSemanticViewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSemanticViewResponseBody getBody() {
        return this.body;
    }

}
