// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UploadEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadEntityResponseBody body;

    public static UploadEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadEntityResponse self = new UploadEntityResponse();
        return TeaModel.build(map, self);
    }

    public UploadEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadEntityResponse setBody(UploadEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadEntityResponseBody getBody() {
        return this.body;
    }

}
