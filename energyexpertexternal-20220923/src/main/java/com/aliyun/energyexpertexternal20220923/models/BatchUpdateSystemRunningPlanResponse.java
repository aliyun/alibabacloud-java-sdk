// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class BatchUpdateSystemRunningPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateSystemRunningPlanResponseBody body;

    public static BatchUpdateSystemRunningPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateSystemRunningPlanResponse self = new BatchUpdateSystemRunningPlanResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateSystemRunningPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateSystemRunningPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateSystemRunningPlanResponse setBody(BatchUpdateSystemRunningPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateSystemRunningPlanResponseBody getBody() {
        return this.body;
    }

}
