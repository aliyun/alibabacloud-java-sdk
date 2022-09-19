// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSqlTemplatesResponseBody body;

    public static DescribeSqlTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlTemplatesResponse self = new DescribeSqlTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlTemplatesResponse setBody(DescribeSqlTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlTemplatesResponseBody getBody() {
        return this.body;
    }

}
