// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class AddFileMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddFileMaterialResponseBody body;

    public static AddFileMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFileMaterialResponse self = new AddFileMaterialResponse();
        return TeaModel.build(map, self);
    }

    public AddFileMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFileMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFileMaterialResponse setBody(AddFileMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFileMaterialResponseBody getBody() {
        return this.body;
    }

}
