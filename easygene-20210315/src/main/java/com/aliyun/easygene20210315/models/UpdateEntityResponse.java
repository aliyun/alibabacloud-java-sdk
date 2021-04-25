// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UpdateEntityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEntityResponseBody body;

    public static UpdateEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEntityResponse self = new UpdateEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEntityResponse setBody(UpdateEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEntityResponseBody getBody() {
        return this.body;
    }

}
