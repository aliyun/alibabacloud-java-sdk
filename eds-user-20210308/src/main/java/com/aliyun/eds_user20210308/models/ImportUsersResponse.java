// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class ImportUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportUsersResponseBody body;

    public static ImportUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportUsersResponse self = new ImportUsersResponse();
        return TeaModel.build(map, self);
    }

    public ImportUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportUsersResponse setBody(ImportUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportUsersResponseBody getBody() {
        return this.body;
    }

}
