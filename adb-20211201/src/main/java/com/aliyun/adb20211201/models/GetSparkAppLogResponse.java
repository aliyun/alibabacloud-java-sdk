// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkAppLogResponseBody body;

    public static GetSparkAppLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppLogResponse self = new GetSparkAppLogResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkAppLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkAppLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkAppLogResponse setBody(GetSparkAppLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkAppLogResponseBody getBody() {
        return this.body;
    }

}
