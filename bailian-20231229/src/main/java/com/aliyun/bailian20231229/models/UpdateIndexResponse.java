// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateIndexResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateIndexResponseBody body;

    public static UpdateIndexResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateIndexResponse self = new UpdateIndexResponse();
        return TeaModel.build(map, self);
    }

    public UpdateIndexResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateIndexResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateIndexResponse setBody(UpdateIndexResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateIndexResponseBody getBody() {
        return this.body;
    }

}
