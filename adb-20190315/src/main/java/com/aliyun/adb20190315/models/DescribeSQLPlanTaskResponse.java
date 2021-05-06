// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLPlanTaskResponseBody body;

    public static DescribeSQLPlanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlanTaskResponse self = new DescribeSQLPlanTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLPlanTaskResponse setBody(DescribeSQLPlanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPlanTaskResponseBody getBody() {
        return this.body;
    }

}
