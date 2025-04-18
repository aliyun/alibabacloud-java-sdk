// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocParsingTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDocParsingTaskResponseBody body;

    public static SubmitDocParsingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParsingTaskResponse self = new SubmitDocParsingTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDocParsingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDocParsingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDocParsingTaskResponse setBody(SubmitDocParsingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDocParsingTaskResponseBody getBody() {
        return this.body;
    }

}
