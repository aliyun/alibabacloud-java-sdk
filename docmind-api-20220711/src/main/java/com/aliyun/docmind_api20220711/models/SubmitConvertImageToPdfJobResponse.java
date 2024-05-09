// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToPdfJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertImageToPdfJobResponseBody body;

    public static SubmitConvertImageToPdfJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToPdfJobResponse self = new SubmitConvertImageToPdfJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToPdfJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertImageToPdfJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertImageToPdfJobResponse setBody(SubmitConvertImageToPdfJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertImageToPdfJobResponseBody getBody() {
        return this.body;
    }

}
