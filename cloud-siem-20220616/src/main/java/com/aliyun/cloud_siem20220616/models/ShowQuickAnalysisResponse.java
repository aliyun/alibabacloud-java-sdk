// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ShowQuickAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ShowQuickAnalysisResponseBody body;

    public static ShowQuickAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        ShowQuickAnalysisResponse self = new ShowQuickAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public ShowQuickAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShowQuickAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShowQuickAnalysisResponse setBody(ShowQuickAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public ShowQuickAnalysisResponseBody getBody() {
        return this.body;
    }

}
