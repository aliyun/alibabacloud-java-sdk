// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class MoveFileMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MoveFileMaterialResponseBody body;

    public static MoveFileMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveFileMaterialResponse self = new MoveFileMaterialResponse();
        return TeaModel.build(map, self);
    }

    public MoveFileMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveFileMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveFileMaterialResponse setBody(MoveFileMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveFileMaterialResponseBody getBody() {
        return this.body;
    }

}
