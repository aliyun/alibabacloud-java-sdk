// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveOrUpdatePatentPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveOrUpdatePatentPlanResponseBody body;

    public static SaveOrUpdatePatentPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdatePatentPlanResponse self = new SaveOrUpdatePatentPlanResponse();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdatePatentPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOrUpdatePatentPlanResponse setBody(SaveOrUpdatePatentPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOrUpdatePatentPlanResponseBody getBody() {
        return this.body;
    }

}
