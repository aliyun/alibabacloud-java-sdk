// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyMaterialResponseBody body;

    public static VerifyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialResponse self = new VerifyMaterialResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyMaterialResponse setBody(VerifyMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyMaterialResponseBody getBody() {
        return this.body;
    }

}
