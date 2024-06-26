// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoTranslationJobResponseBody body;

    public static SubmitVideoTranslationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoTranslationJobResponse self = new SubmitVideoTranslationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoTranslationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoTranslationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoTranslationJobResponse setBody(SubmitVideoTranslationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoTranslationJobResponseBody getBody() {
        return this.body;
    }

}
