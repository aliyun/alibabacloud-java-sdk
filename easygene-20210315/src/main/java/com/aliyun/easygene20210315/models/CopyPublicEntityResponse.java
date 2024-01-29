// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CopyPublicEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CopyPublicEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyPublicEntityResponse setBody(CopyPublicEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyPublicEntityResponseBody getBody() {
        return this.body;
    }

}
