// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePatentPlanDetailResponseBody body;

    public static DeletePatentPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentPlanDetailResponse self = new DeletePatentPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public DeletePatentPlanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePatentPlanDetailResponse setBody(DeletePatentPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePatentPlanDetailResponseBody getBody() {
        return this.body;
    }

}
