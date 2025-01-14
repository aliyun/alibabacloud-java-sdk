// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UnTagDataAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnTagDataAssetsResponseBody body;

    public static UnTagDataAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagDataAssetsResponse self = new UnTagDataAssetsResponse();
        return TeaModel.build(map, self);
    }

    public UnTagDataAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnTagDataAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnTagDataAssetsResponse setBody(UnTagDataAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnTagDataAssetsResponseBody getBody() {
        return this.body;
    }

}
