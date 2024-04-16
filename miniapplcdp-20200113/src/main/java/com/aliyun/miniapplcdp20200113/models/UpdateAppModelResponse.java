// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppModelResponseBody body;

    public static UpdateAppModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModelResponse self = new UpdateAppModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppModelResponse setBody(UpdateAppModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppModelResponseBody getBody() {
        return this.body;
    }

}
