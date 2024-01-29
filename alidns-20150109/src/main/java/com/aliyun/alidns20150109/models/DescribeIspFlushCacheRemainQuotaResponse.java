// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheRemainQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIspFlushCacheRemainQuotaResponseBody body;

    public static DescribeIspFlushCacheRemainQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheRemainQuotaResponse self = new DescribeIspFlushCacheRemainQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheRemainQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIspFlushCacheRemainQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIspFlushCacheRemainQuotaResponse setBody(DescribeIspFlushCacheRemainQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIspFlushCacheRemainQuotaResponseBody getBody() {
        return this.body;
    }

}
