// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DeleteLogAnalysisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogAnalysisResponseBody body;

    public static DeleteLogAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogAnalysisResponse self = new DeleteLogAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogAnalysisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogAnalysisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogAnalysisResponse setBody(DeleteLogAnalysisResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogAnalysisResponseBody getBody() {
        return this.body;
    }

}
