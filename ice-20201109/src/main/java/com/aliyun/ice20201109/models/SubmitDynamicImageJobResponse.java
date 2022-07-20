// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicImageJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDynamicImageJobResponseBody body;

    public static SubmitDynamicImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicImageJobResponse self = new SubmitDynamicImageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDynamicImageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDynamicImageJobResponse setBody(SubmitDynamicImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDynamicImageJobResponseBody getBody() {
        return this.body;
    }

}
