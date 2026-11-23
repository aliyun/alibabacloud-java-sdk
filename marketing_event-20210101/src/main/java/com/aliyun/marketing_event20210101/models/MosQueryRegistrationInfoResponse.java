// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class MosQueryRegistrationInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MosQueryRegistrationInfoResponseBody body;

    public static MosQueryRegistrationInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        MosQueryRegistrationInfoResponse self = new MosQueryRegistrationInfoResponse();
        return TeaModel.build(map, self);
    }

    public MosQueryRegistrationInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MosQueryRegistrationInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MosQueryRegistrationInfoResponse setBody(MosQueryRegistrationInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public MosQueryRegistrationInfoResponseBody getBody() {
        return this.body;
    }

}
