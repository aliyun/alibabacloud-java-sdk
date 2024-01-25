// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CheckDataSourceLinkConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDataSourceLinkConnectionResponseBody body;

    public static CheckDataSourceLinkConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDataSourceLinkConnectionResponse self = new CheckDataSourceLinkConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CheckDataSourceLinkConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDataSourceLinkConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDataSourceLinkConnectionResponse setBody(CheckDataSourceLinkConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDataSourceLinkConnectionResponseBody getBody() {
        return this.body;
    }

}
