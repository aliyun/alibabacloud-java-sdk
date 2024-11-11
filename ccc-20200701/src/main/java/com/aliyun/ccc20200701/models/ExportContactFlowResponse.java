// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ExportContactFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportContactFlowResponseBody body;

    public static ExportContactFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportContactFlowResponse self = new ExportContactFlowResponse();
        return TeaModel.build(map, self);
    }

    public ExportContactFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportContactFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportContactFlowResponse setBody(ExportContactFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportContactFlowResponseBody getBody() {
        return this.body;
    }

}
