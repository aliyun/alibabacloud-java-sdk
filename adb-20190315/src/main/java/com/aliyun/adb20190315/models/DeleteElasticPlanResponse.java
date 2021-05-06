// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DeleteElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteElasticPlanResponse setBody(DeleteElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteElasticPlanResponseBody getBody() {
        return this.body;
    }

}
