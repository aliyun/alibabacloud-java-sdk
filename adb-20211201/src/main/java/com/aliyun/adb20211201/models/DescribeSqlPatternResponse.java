// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlPatternResponseBody body;

    public static DescribeSqlPatternResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlPatternResponse self = new DescribeSqlPatternResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlPatternResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlPatternResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlPatternResponse setBody(DescribeSqlPatternResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlPatternResponseBody getBody() {
        return this.body;
    }

}
