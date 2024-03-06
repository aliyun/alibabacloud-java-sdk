// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKeyDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKeyDescriptionResponseBody body;

    public static UpdateKeyDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeyDescriptionResponse self = new UpdateKeyDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKeyDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKeyDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKeyDescriptionResponse setBody(UpdateKeyDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKeyDescriptionResponseBody getBody() {
        return this.body;
    }

}
