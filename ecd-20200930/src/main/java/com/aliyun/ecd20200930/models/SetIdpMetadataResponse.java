// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetIdpMetadataResponseBody body;

    public static SetIdpMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataResponse self = new SetIdpMetadataResponse();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetIdpMetadataResponse setBody(SetIdpMetadataResponseBody body) {
        this.body = body;
        return this;
    }
    public SetIdpMetadataResponseBody getBody() {
        return this.body;
    }

}
