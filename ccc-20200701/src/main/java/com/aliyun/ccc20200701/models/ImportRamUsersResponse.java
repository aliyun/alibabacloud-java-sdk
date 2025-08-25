// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportRamUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportRamUsersResponseBody body;

    public static ImportRamUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportRamUsersResponse self = new ImportRamUsersResponse();
        return TeaModel.build(map, self);
    }

    public ImportRamUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportRamUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportRamUsersResponse setBody(ImportRamUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportRamUsersResponseBody getBody() {
        return this.body;
    }

}
