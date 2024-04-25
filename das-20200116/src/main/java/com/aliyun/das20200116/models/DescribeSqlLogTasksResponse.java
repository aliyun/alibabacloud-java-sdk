// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlLogTasksResponseBody body;

    public static DescribeSqlLogTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTasksResponse self = new DescribeSqlLogTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlLogTasksResponse setBody(DescribeSqlLogTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogTasksResponseBody getBody() {
        return this.body;
    }

}
