// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkReplSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkReplSessionResponseBody body;

    public static GetSparkReplSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkReplSessionResponse self = new GetSparkReplSessionResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkReplSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkReplSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkReplSessionResponse setBody(GetSparkReplSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkReplSessionResponseBody getBody() {
        return this.body;
    }

}
