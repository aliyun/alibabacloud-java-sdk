// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateRestorePlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRestorePlanResponseBody body;

    public static CreateRestorePlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRestorePlanResponse self = new CreateRestorePlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateRestorePlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRestorePlanResponse setBody(CreateRestorePlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRestorePlanResponseBody getBody() {
        return this.body;
    }

}
