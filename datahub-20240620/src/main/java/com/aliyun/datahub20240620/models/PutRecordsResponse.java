// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class PutRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutRecordsResponseBody body;

    public static PutRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutRecordsResponse self = new PutRecordsResponse();
        return TeaModel.build(map, self);
    }

    public PutRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutRecordsResponse setBody(PutRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutRecordsResponseBody getBody() {
        return this.body;
    }

}
