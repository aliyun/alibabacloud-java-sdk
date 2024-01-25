// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceInstanceResponseBody body;

    public static UpdateResourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceResponse self = new UpdateResourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceInstanceResponse setBody(UpdateResourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceInstanceResponseBody getBody() {
        return this.body;
    }

}
