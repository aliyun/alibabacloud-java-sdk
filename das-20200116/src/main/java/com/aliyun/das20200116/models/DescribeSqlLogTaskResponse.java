// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlLogTaskResponseBody body;

    public static DescribeSqlLogTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTaskResponse self = new DescribeSqlLogTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlLogTaskResponse setBody(DescribeSqlLogTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogTaskResponseBody getBody() {
        return this.body;
    }

}
