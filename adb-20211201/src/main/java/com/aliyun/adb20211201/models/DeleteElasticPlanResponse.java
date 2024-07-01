// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteElasticPlanResponseBody body;

    public static DeleteElasticPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticPlanResponse self = new DeleteElasticPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteElasticPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteElasticPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteElasticPlanResponse setBody(DeleteElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteElasticPlanResponseBody getBody() {
        return this.body;
    }

}
