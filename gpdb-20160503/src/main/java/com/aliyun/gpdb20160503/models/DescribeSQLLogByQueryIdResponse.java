// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogByQueryIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogByQueryIdResponseBody body;

    public static DescribeSQLLogByQueryIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogByQueryIdResponse self = new DescribeSQLLogByQueryIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogByQueryIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogByQueryIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogByQueryIdResponse setBody(DescribeSQLLogByQueryIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogByQueryIdResponseBody getBody() {
        return this.body;
    }

}
