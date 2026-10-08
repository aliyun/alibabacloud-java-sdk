// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class MosCheckInResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MosCheckInResponseBody body;

    public static MosCheckInResponse build(java.util.Map<String, ?> map) throws Exception {
        MosCheckInResponse self = new MosCheckInResponse();
        return TeaModel.build(map, self);
    }

    public MosCheckInResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MosCheckInResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MosCheckInResponse setBody(MosCheckInResponseBody body) {
        this.body = body;
        return this;
    }
    public MosCheckInResponseBody getBody() {
        return this.body;
    }

}
