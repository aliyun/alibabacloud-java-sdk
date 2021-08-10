// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePatentPlanResponseBody body;

    public static DeletePatentPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentPlanResponse self = new DeletePatentPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeletePatentPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePatentPlanResponse setBody(DeletePatentPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePatentPlanResponseBody getBody() {
        return this.body;
    }

}
