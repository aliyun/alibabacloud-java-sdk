// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class ExportPatentPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportPatentPlanDetailResponseBody body;

    public static ExportPatentPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportPatentPlanDetailResponse self = new ExportPatentPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public ExportPatentPlanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportPatentPlanDetailResponse setBody(ExportPatentPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportPatentPlanDetailResponseBody getBody() {
        return this.body;
    }

}
