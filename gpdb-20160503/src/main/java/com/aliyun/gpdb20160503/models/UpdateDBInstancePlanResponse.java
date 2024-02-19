// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateDBInstancePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDBInstancePlanResponseBody body;

    public static UpdateDBInstancePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstancePlanResponse self = new UpdateDBInstancePlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstancePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDBInstancePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDBInstancePlanResponse setBody(UpdateDBInstancePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDBInstancePlanResponseBody getBody() {
        return this.body;
    }

}
