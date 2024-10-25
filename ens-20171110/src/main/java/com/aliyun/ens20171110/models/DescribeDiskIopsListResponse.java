// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDiskIopsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiskIopsListResponseBody body;

    public static DescribeDiskIopsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiskIopsListResponse self = new DescribeDiskIopsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiskIopsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiskIopsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiskIopsListResponse setBody(DescribeDiskIopsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiskIopsListResponseBody getBody() {
        return this.body;
    }

}
