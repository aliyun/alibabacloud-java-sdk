// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AppendCasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AppendCasesResponseBody body;

    public static AppendCasesResponse build(java.util.Map<String, ?> map) throws Exception {
        AppendCasesResponse self = new AppendCasesResponse();
        return TeaModel.build(map, self);
    }

    public AppendCasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AppendCasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AppendCasesResponse setBody(AppendCasesResponseBody body) {
        this.body = body;
        return this;
    }
    public AppendCasesResponseBody getBody() {
        return this.body;
    }

}
