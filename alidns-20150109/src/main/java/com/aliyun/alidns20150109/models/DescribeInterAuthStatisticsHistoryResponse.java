// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInterAuthStatisticsHistoryResponseBody body;

    public static DescribeInterAuthStatisticsHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsHistoryResponse self = new DescribeInterAuthStatisticsHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInterAuthStatisticsHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInterAuthStatisticsHistoryResponse setBody(DescribeInterAuthStatisticsHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInterAuthStatisticsHistoryResponseBody getBody() {
        return this.body;
    }

}
