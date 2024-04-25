// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlLogRecordsResponseBody body;

    public static DescribeSqlLogRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogRecordsResponse self = new DescribeSqlLogRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlLogRecordsResponse setBody(DescribeSqlLogRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogRecordsResponseBody getBody() {
        return this.body;
    }

}
