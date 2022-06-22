// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class RunInspectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunInspectionResponseBody body;

    public static RunInspectionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInspectionResponse self = new RunInspectionResponse();
        return TeaModel.build(map, self);
    }

    public RunInspectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunInspectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunInspectionResponse setBody(RunInspectionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunInspectionResponseBody getBody() {
        return this.body;
    }

}
