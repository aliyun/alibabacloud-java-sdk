// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class UpdateAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAnalysisResponseBody body;

    public static UpdateAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnalysisResponse self = new UpdateAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAnalysisResponse setBody(UpdateAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAnalysisResponseBody getBody() {
        return this.body;
    }

}
