// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLPlanResponseBody body;

    public static DescribeSQLPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlanResponse self = new DescribeSQLPlanResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLPlanResponse setBody(DescribeSQLPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPlanResponseBody getBody() {
        return this.body;
    }

}
