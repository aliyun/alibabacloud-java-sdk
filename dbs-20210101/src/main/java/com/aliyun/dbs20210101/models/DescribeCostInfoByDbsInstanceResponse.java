// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeCostInfoByDbsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCostInfoByDbsInstanceResponseBody body;

    public static DescribeCostInfoByDbsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostInfoByDbsInstanceResponse self = new DescribeCostInfoByDbsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCostInfoByDbsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCostInfoByDbsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCostInfoByDbsInstanceResponse setBody(DescribeCostInfoByDbsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCostInfoByDbsInstanceResponseBody getBody() {
        return this.body;
    }

}
