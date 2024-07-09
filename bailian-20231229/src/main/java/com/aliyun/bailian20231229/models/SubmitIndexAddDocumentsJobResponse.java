// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class SubmitIndexAddDocumentsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitIndexAddDocumentsJobResponseBody body;

    public static SubmitIndexAddDocumentsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitIndexAddDocumentsJobResponse self = new SubmitIndexAddDocumentsJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitIndexAddDocumentsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitIndexAddDocumentsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitIndexAddDocumentsJobResponse setBody(SubmitIndexAddDocumentsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitIndexAddDocumentsJobResponseBody getBody() {
        return this.body;
    }

}
