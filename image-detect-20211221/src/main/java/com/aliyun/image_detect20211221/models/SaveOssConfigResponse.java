// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class SaveOssConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveOssConfigResponseBody body;

    public static SaveOssConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOssConfigResponse self = new SaveOssConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveOssConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOssConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveOssConfigResponse setBody(SaveOssConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOssConfigResponseBody getBody() {
        return this.body;
    }

}
