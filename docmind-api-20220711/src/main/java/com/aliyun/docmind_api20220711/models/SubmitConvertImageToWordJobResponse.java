// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToWordJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitConvertImageToWordJobResponseBody body;

    public static SubmitConvertImageToWordJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToWordJobResponse self = new SubmitConvertImageToWordJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToWordJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitConvertImageToWordJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitConvertImageToWordJobResponse setBody(SubmitConvertImageToWordJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitConvertImageToWordJobResponseBody getBody() {
        return this.body;
    }

}
