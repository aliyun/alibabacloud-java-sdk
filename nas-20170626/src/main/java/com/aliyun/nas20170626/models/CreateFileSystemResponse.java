// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFileSystemResponseBody body;

    public static CreateFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponse self = new CreateFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileSystemResponse setBody(CreateFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileSystemResponseBody getBody() {
        return this.body;
    }

}
