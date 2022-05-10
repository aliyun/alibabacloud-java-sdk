// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DataStoreCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DataStoreCredentialResponseBody body;

    public static DataStoreCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DataStoreCredentialResponse self = new DataStoreCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DataStoreCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DataStoreCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DataStoreCredentialResponse setBody(DataStoreCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DataStoreCredentialResponseBody getBody() {
        return this.body;
    }

}
