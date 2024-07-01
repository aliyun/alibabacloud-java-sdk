// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyPerformanceViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPerformanceViewResponseBody body;

    public static ModifyPerformanceViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPerformanceViewResponse self = new ModifyPerformanceViewResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPerformanceViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPerformanceViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPerformanceViewResponse setBody(ModifyPerformanceViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPerformanceViewResponseBody getBody() {
        return this.body;
    }

}
