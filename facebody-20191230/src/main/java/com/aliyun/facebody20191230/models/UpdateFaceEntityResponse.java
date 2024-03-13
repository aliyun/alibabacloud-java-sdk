// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class UpdateFaceEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFaceEntityResponseBody body;

    public static UpdateFaceEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceEntityResponse self = new UpdateFaceEntityResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFaceEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFaceEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFaceEntityResponse setBody(UpdateFaceEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFaceEntityResponseBody getBody() {
        return this.body;
    }

}
