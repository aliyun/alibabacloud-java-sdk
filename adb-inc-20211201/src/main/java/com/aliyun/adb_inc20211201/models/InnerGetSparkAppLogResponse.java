// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class InnerGetSparkAppLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InnerGetSparkAppLogResponseBody body;

    public static InnerGetSparkAppLogResponse build(java.util.Map<String, ?> map) throws Exception {
        InnerGetSparkAppLogResponse self = new InnerGetSparkAppLogResponse();
        return TeaModel.build(map, self);
    }

    public InnerGetSparkAppLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InnerGetSparkAppLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InnerGetSparkAppLogResponse setBody(InnerGetSparkAppLogResponseBody body) {
        this.body = body;
        return this;
    }
    public InnerGetSparkAppLogResponseBody getBody() {
        return this.body;
    }

}
