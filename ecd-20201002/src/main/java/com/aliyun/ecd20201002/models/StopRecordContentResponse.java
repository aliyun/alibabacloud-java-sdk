// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StopRecordContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopRecordContentResponseBody body;

    public static StopRecordContentResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRecordContentResponse self = new StopRecordContentResponse();
        return TeaModel.build(map, self);
    }

    public StopRecordContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRecordContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRecordContentResponse setBody(StopRecordContentResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRecordContentResponseBody getBody() {
        return this.body;
    }

}
