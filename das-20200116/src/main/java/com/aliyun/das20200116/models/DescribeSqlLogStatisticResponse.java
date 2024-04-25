// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlLogStatisticResponseBody body;

    public static DescribeSqlLogStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogStatisticResponse self = new DescribeSqlLogStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlLogStatisticResponse setBody(DescribeSqlLogStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogStatisticResponseBody getBody() {
        return this.body;
    }

}
