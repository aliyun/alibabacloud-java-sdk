// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class CheckOssObjectContentConsistencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckOssObjectContentConsistencyResponseBody body;

    public static CheckOssObjectContentConsistencyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOssObjectContentConsistencyResponse self = new CheckOssObjectContentConsistencyResponse();
        return TeaModel.build(map, self);
    }

    public CheckOssObjectContentConsistencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOssObjectContentConsistencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckOssObjectContentConsistencyResponse setBody(CheckOssObjectContentConsistencyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOssObjectContentConsistencyResponseBody getBody() {
        return this.body;
    }

}
