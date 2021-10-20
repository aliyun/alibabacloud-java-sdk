// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSqlPatternResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSqlPatternResponse setBody(DescribeSqlPatternResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlPatternResponseBody getBody() {
        return this.body;
    }

}
