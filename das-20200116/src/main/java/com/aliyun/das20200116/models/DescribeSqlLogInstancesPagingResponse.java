// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogInstancesPagingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlLogInstancesPagingResponseBody body;

    public static DescribeSqlLogInstancesPagingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogInstancesPagingResponse self = new DescribeSqlLogInstancesPagingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogInstancesPagingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlLogInstancesPagingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlLogInstancesPagingResponse setBody(DescribeSqlLogInstancesPagingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlLogInstancesPagingResponseBody getBody() {
        return this.body;
    }

}
