// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSQLPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeSQLPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLPlanResponse setBody(DescribeSQLPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLPlanResponseBody getBody() {
        return this.body;
    }

}
