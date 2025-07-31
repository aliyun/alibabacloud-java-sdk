// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CheckProjectHasDependencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckProjectHasDependencyResponseBody body;

    public static CheckProjectHasDependencyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckProjectHasDependencyResponse self = new CheckProjectHasDependencyResponse();
        return TeaModel.build(map, self);
    }

    public CheckProjectHasDependencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckProjectHasDependencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckProjectHasDependencyResponse setBody(CheckProjectHasDependencyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckProjectHasDependencyResponseBody getBody() {
        return this.body;
    }

}
