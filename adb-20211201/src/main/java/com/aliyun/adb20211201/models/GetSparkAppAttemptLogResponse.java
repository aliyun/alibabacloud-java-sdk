// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppAttemptLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSparkAppAttemptLogResponseBody body;

    public static GetSparkAppAttemptLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppAttemptLogResponse self = new GetSparkAppAttemptLogResponse();
        return TeaModel.build(map, self);
    }

    public GetSparkAppAttemptLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSparkAppAttemptLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSparkAppAttemptLogResponse setBody(GetSparkAppAttemptLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSparkAppAttemptLogResponseBody getBody() {
        return this.body;
    }

}
