// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstancePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBInstancePlanResponseBody body;

    public static CreateDBInstancePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstancePlanResponse self = new CreateDBInstancePlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBInstancePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBInstancePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBInstancePlanResponse setBody(CreateDBInstancePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBInstancePlanResponseBody getBody() {
        return this.body;
    }

}
