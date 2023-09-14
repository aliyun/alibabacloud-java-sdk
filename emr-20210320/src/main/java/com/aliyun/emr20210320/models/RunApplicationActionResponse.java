// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApplicationActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunApplicationActionResponseBody body;

    public static RunApplicationActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunApplicationActionResponse self = new RunApplicationActionResponse();
        return TeaModel.build(map, self);
    }

    public RunApplicationActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunApplicationActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunApplicationActionResponse setBody(RunApplicationActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunApplicationActionResponseBody getBody() {
        return this.body;
    }

}
