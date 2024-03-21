// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StartRecordContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRecordContentResponseBody body;

    public static StartRecordContentResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRecordContentResponse self = new StartRecordContentResponse();
        return TeaModel.build(map, self);
    }

    public StartRecordContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRecordContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRecordContentResponse setBody(StartRecordContentResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRecordContentResponseBody getBody() {
        return this.body;
    }

}
