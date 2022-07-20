// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSyncMediaInfoJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSyncMediaInfoJobResponseBody body;

    public static SubmitSyncMediaInfoJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSyncMediaInfoJobResponse self = new SubmitSyncMediaInfoJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSyncMediaInfoJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSyncMediaInfoJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSyncMediaInfoJobResponse setBody(SubmitSyncMediaInfoJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSyncMediaInfoJobResponseBody getBody() {
        return this.body;
    }

}
