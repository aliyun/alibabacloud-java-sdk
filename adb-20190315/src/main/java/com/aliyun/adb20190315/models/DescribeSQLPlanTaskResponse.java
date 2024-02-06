// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeSQLPlanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLPlanTaskResponse setBody(DescribeSQLPlanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPlanTaskResponseBody getBody() {
        return this.body;
    }

}
