// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBakDataSourceStorageAccessInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBakDataSourceStorageAccessInfoResponseBody body;

    public static DescribeBakDataSourceStorageAccessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBakDataSourceStorageAccessInfoResponse self = new DescribeBakDataSourceStorageAccessInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBakDataSourceStorageAccessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBakDataSourceStorageAccessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBakDataSourceStorageAccessInfoResponse setBody(DescribeBakDataSourceStorageAccessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBakDataSourceStorageAccessInfoResponseBody getBody() {
        return this.body;
    }

}
