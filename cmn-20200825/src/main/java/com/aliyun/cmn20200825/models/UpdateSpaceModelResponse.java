// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpaceModelResponseBody body;

    public static UpdateSpaceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelResponse self = new UpdateSpaceModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpaceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSpaceModelResponse setBody(UpdateSpaceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpaceModelResponseBody getBody() {
        return this.body;
    }

}
