// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetOssStorageAndAccByBucketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssStorageAndAccByBucketsResponseBody body;

    public static GetOssStorageAndAccByBucketsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssStorageAndAccByBucketsResponse self = new GetOssStorageAndAccByBucketsResponse();
        return TeaModel.build(map, self);
    }

    public GetOssStorageAndAccByBucketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssStorageAndAccByBucketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssStorageAndAccByBucketsResponse setBody(GetOssStorageAndAccByBucketsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssStorageAndAccByBucketsResponseBody getBody() {
        return this.body;
    }

}
