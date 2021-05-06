// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyElasticPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyElasticPlanResponseBody body;

    public static ModifyElasticPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticPlanResponse self = new ModifyElasticPlanResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticPlanResponse setBody(ModifyElasticPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticPlanResponseBody getBody() {
        return this.body;
    }

}
