// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetouchSkinResponseBody body;

    public static RetouchSkinResponse build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinResponse self = new RetouchSkinResponse();
        return TeaModel.build(map, self);
    }

    public RetouchSkinResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetouchSkinResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetouchSkinResponse setBody(RetouchSkinResponseBody body) {
        this.body = body;
        return this;
    }
    public RetouchSkinResponseBody getBody() {
        return this.body;
    }

}
