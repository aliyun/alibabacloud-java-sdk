// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlInsightStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlInsightStatisticResponseBody body;

    public static DescribeSqlInsightStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlInsightStatisticResponse self = new DescribeSqlInsightStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlInsightStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlInsightStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlInsightStatisticResponse setBody(DescribeSqlInsightStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlInsightStatisticResponseBody getBody() {
        return this.body;
    }

}
