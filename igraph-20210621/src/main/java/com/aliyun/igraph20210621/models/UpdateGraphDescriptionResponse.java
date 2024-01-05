// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.igraph20210621.models;

import com.aliyun.tea.*;

public class UpdateGraphDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGraphDescriptionResponseBody body;

    public static UpdateGraphDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGraphDescriptionResponse self = new UpdateGraphDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGraphDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGraphDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGraphDescriptionResponse setBody(UpdateGraphDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGraphDescriptionResponseBody getBody() {
        return this.body;
    }

}
