// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitContainerLoadPlanExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitContainerLoadPlanExtractJobResponseBody body;

    public static SubmitContainerLoadPlanExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitContainerLoadPlanExtractJobResponse self = new SubmitContainerLoadPlanExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitContainerLoadPlanExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitContainerLoadPlanExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitContainerLoadPlanExtractJobResponse setBody(SubmitContainerLoadPlanExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitContainerLoadPlanExtractJobResponseBody getBody() {
        return this.body;
    }

}
