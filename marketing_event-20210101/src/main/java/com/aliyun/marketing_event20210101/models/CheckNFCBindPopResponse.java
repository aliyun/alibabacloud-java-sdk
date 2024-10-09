// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class CheckNFCBindPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckNFCBindPopResponseBody body;

    public static CheckNFCBindPopResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckNFCBindPopResponse self = new CheckNFCBindPopResponse();
        return TeaModel.build(map, self);
    }

    public CheckNFCBindPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckNFCBindPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckNFCBindPopResponse setBody(CheckNFCBindPopResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckNFCBindPopResponseBody getBody() {
        return this.body;
    }

}
