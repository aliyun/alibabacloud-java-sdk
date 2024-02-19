// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteDBInstancePlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBInstancePlanResponseBody body;

    public static DeleteDBInstancePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstancePlanResponse self = new DeleteDBInstancePlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstancePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBInstancePlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBInstancePlanResponse setBody(DeleteDBInstancePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBInstancePlanResponseBody getBody() {
        return this.body;
    }

}
