// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkDefinitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkDefinitionsResponseBody body;

    public static GetSparkDefinitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkDefinitionsResponse self = new GetSparkDefinitionsResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkDefinitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkDefinitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkDefinitionsResponse setBody(GetSparkDefinitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkDefinitionsResponseBody getBody() {
        return this.body;
    }

}
