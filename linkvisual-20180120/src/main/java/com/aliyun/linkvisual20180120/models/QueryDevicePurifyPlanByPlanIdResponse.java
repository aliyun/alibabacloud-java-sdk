// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlanByPlanIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePurifyPlanByPlanIdResponseBody body;

    public static QueryDevicePurifyPlanByPlanIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlanByPlanIdResponse self = new QueryDevicePurifyPlanByPlanIdResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlanByPlanIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePurifyPlanByPlanIdResponse setBody(QueryDevicePurifyPlanByPlanIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePurifyPlanByPlanIdResponseBody getBody() {
        return this.body;
    }

}
