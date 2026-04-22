// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInterAuthStatisticsSummaryResponseBody body;

    public static DescribeInterAuthStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsSummaryResponse self = new DescribeInterAuthStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInterAuthStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInterAuthStatisticsSummaryResponse setBody(DescribeInterAuthStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInterAuthStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
