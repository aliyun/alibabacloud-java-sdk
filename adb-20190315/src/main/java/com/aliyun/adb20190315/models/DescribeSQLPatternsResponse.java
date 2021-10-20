// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPatternsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLPatternsResponseBody body;

    public static DescribeSQLPatternsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPatternsResponse self = new DescribeSQLPatternsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPatternsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLPatternsResponse setBody(DescribeSQLPatternsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPatternsResponseBody getBody() {
        return this.body;
    }

}
