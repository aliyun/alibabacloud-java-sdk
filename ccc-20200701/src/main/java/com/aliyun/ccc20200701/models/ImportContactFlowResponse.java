// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportContactFlowResponseBody body;

    public static ImportContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportContactFlowResponse self = new ImportContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public ImportContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportContactFlowResponse setBody(ImportContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportContactFlowResponseBody getBody() {
        return this.body;
    }

}
