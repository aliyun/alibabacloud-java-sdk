// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSpaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpaceResponseBody body;

    public static UpdateSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceResponse self = new UpdateSpaceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSpaceResponse setBody(UpdateSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpaceResponseBody getBody() {
        return this.body;
    }

}
