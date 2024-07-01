// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SetSparkAppLogRootPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSparkAppLogRootPathResponseBody body;

    public static SetSparkAppLogRootPathResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSparkAppLogRootPathResponse self = new SetSparkAppLogRootPathResponse();
        return TeaModel.build(map, self);
    }

    public SetSparkAppLogRootPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSparkAppLogRootPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSparkAppLogRootPathResponse setBody(SetSparkAppLogRootPathResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSparkAppLogRootPathResponseBody getBody() {
        return this.body;
    }

}
