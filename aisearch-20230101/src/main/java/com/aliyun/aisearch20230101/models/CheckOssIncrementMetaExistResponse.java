// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class CheckOssIncrementMetaExistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckOssIncrementMetaExistResponseBody body;

    public static CheckOssIncrementMetaExistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOssIncrementMetaExistResponse self = new CheckOssIncrementMetaExistResponse();
        return TeaModel.build(map, self);
    }

    public CheckOssIncrementMetaExistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOssIncrementMetaExistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckOssIncrementMetaExistResponse setBody(CheckOssIncrementMetaExistResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOssIncrementMetaExistResponseBody getBody() {
        return this.body;
    }

}
