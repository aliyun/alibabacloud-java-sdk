// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetDBInstancePlanStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDBInstancePlanStatusResponseBody body;

    public static SetDBInstancePlanStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDBInstancePlanStatusResponse self = new SetDBInstancePlanStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDBInstancePlanStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDBInstancePlanStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDBInstancePlanStatusResponse setBody(SetDBInstancePlanStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDBInstancePlanStatusResponseBody getBody() {
        return this.body;
    }

}
