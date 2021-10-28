// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CopyPublicEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyPublicEntityResponseBody body;

    public static CopyPublicEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyPublicEntityResponse self = new CopyPublicEntityResponse();
        return TeaModel.build(map, self);
    }

    public CopyPublicEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyPublicEntityResponse setBody(CopyPublicEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyPublicEntityResponseBody getBody() {
        return this.body;
    }

}
