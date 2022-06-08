// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class SaveMqConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveMqConfigResponseBody body;

    public static SaveMqConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMqConfigResponse self = new SaveMqConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveMqConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMqConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveMqConfigResponse setBody(SaveMqConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMqConfigResponseBody getBody() {
        return this.body;
    }

}
