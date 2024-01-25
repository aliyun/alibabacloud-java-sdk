// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateFoundationReferenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFoundationReferenceResponseBody body;

    public static UpdateFoundationReferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFoundationReferenceResponse self = new UpdateFoundationReferenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFoundationReferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFoundationReferenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFoundationReferenceResponse setBody(UpdateFoundationReferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFoundationReferenceResponseBody getBody() {
        return this.body;
    }

}
