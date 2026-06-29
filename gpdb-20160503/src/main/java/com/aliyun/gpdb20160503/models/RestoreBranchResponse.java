// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestoreBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreBranchResponseBody body;

    public static RestoreBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreBranchResponse self = new RestoreBranchResponse();
        return TeaModel.build(map, self);
    }

    public RestoreBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreBranchResponse setBody(RestoreBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreBranchResponseBody getBody() {
        return this.body;
    }

}
