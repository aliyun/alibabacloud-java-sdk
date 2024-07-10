// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitCopyrightExtractJobResponseBody body;

    public static SubmitCopyrightExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractJobResponse self = new SubmitCopyrightExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCopyrightExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitCopyrightExtractJobResponse setBody(SubmitCopyrightExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCopyrightExtractJobResponseBody getBody() {
        return this.body;
    }

}
